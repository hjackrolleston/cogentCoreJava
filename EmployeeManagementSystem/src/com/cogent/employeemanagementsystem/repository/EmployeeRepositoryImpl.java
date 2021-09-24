package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	private Employee employees[] = new Employee[10];

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
		
	// TODO Auto-generated method stub
	//return null;
	}
	@Override
	public void deleteAllEmployees() {
		this.employees = new Employee[10];
		System.out.println("Record fully emptied.");
		// TODO Auto-generated method stub
		
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

	public Employee getEmployeeById(String id) {
		for (Employee employee : employees) {
			if (employee != null && id.equals(employee.getEmployeeId())) {
				return employee;
			}
		}
		return null;
	}

	public Employee[] getEmployees() {
		return employees;
	}
	// 1) check if id exists or not
	// 2) if it exists, then set null to location (can't actually delete it)
	// 3) if we can't find it, return notfound

	@Override
	public String deleteEmployeeById(String id) {
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
			} else {return "not found";}
		} return "not found";
	}
	
	@Override
	public Employee getEmployeeByName(String fName,String lName) {
		for (Employee e: employees) {
			if (e!=null) {
				if (fName.equals(e.getFirstName())&&lName.equals(e.getLastName())) {
					return e;
				}
			}
		}System.out.println("Employee with this name does not exist.");
		return null;
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
