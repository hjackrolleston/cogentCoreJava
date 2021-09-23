package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	// are we consuming the repo?
	
	public void showNameList() {
		for (Employee employee2:employeeRepository.getEmployees()) {
			if (employee2!=null) {
				System.out.println(employee2.getFirstName()+" "+employee2.getLastName());
			}else {System.out.println("[empty]");}
		}
	}
	
	private Employee employees[] = new Employee[10];
	
	static int counter=0;
	@Override
	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) {
		return employeeRepository.deleteEmployeeById(id);
	}

	public Employee getEmployeeByName(String fName,String lName) {
		return employeeRepository.getEmployeeByName(fName,lName);
	}
	
	@Override
	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
		
	}
	@Override
	public String updateEmployees(String id, Employee employee) {
		return employeeRepository.updateEmployees(id,employee);
		//return null;
	}
}
