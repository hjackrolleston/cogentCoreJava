package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidNameException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	private Employee employees[] = new Employee[10];
	//private ArrayList<Employee> employees = new ArrayList<>();
	
	private static EmployeeRepositoryImpl employeeRepository;

	private EmployeeRepositoryImpl() {}

	public static EmployeeRepository/*Impl*/ getInstance() {
		if (employeeRepository == null) {
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	@Override
	public String updateEmployees(String id, Employee employee) {
		for (int i=0;i<employees.length;i++){
			if (employees[i]!=null) {
				if ( id.equals(employees[i].getEmployeeId()) ){
					employees[i] = employee;
					return "Updated employee "+employee+": "
							+ employees[i].getEmployeeId()+" "+ employees[i].getFirstName()
							+" "+employees[i].getLastName()+" "+employees[i].getEmpSalary();
				}
			}
		}return "Employee not found with this id.";
	//return null;
	}
	@Override
	public void deleteAllEmployees() {
		this.employees = new Employee[10];
		System.out.println("Record fully emptied.");
	}
	
	@Override
	public boolean isEmployeeExists(String id) {
		for (Employee emmp: employees) {
			if(id.equals(emmp.getEmployeeId())) {return true;}
		}return false;
	}
	
	static int counter = 0;

	public String addEmployee(Employee employee) {
		for (int ct=0;ct<employees.length;ct++) {
			if(employees[ct]==null) {employees[ct]=employee; return "Success.";}
		}return "Array is full.";
		
		/*if (counter >= employees.length) {
			return "array is full";
		}
		employees[++counter] = employee;
		return "success";*/
	}

	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		// to throw caught exception to the caller
		for (Employee employee : employees) {
			if (employee != null && id.equals(employee.getEmployeeId())) {
				return employee;
			}
		}
		//return null;
		throw new IdNotFoundException("Id not found.");
		// idnotfound exception(?) - user-defined
	}

	@Override
	public List<Employee> getEmployees() {
		//return employees;
		return employeeRepository.getEmployees();
		
		//Employee employee[] = new Employee[employees.size()];
		//return employees.toArray(employee);
	}
	// 1) check if id exists or not
	// 2) if it exists, then set null to location (can't actually delete it)
	// 3) if we can't find it, return notfound

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		Employee employee = this.getEmployeeById(id);
		if (employee!=null) {
			int index=this.getIndex(employee);
			if(index!=-1) {
				employees[index]=null;
				
				//// Sliding the array back down into the empty slot.
				for (int j=index;j<(employees.length-1);j++) {
					employees[j]=employees[j+1];
				}employees[employees.length-1]=null;
				////
				
				return"Deleted.";
			} else {
				//return "not found";
				throw new IdNotFoundException("ID not found");
			}
		}
		throw new IdNotFoundException("ID not found.");
		//return "not found";
	}
	
	@Override
	public Employee getEmployeeByName(String fName,String lName) {
		for (Employee e: employees) {
			if (e!=null) {
				if (fName.equals(e.getFirstName())&&lName.equals(e.getLastName())) {
					return e;
				}
			}
		}//System.out.println("Employee with this name does not exist.");
		throw new InvalidNameException("Employee with this name does not exist.");
		//return null;
	}
	
	/** Method added: 2021 Sept 23 Thurs (Day 4)
	 * */
	private static int index=0;
	public Employee[] getEmployeesByName(String name) {
		Employee[] employeesTemp=new Employee[employees.length];
		for (Employee employee : employees) {
			if (employee.getFirstName().equals(name)) {
				employeesTemp [index++] = employee;
			}
		} return employeesTemp;
	}
	
	private int getIndex(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].equals(employee)) {
				return i;
			}
		}
		return -1;
	}
}
