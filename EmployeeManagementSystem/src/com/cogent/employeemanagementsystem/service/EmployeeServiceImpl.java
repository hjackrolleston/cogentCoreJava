package com.cogent.employeemanagementsystem.service;
import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;
//import com.cogent.employeemanagementsystem.repository.EmployeeService;
//import com.cogent.employeemanagementsystem.repository.EmployeeServiceImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private static EmployeeServiceImpl employeeService;
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	// are we consuming the repo?
	
	public void showNameList() {
		for (Employee employee2:employeeRepository.getEmployees()) {
			if (employee2!=null) {
				System.out.println(employee2.getFirstName()+" "+employee2.getLastName());
			}else {System.out.println("[empty]");}
		}
	}
	private EmployeeServiceImpl() {}
	
	public static EmployeeService/*Impl*/ getInstance() {
		if (employeeService == null) {
			employeeService = new EmployeeServiceImpl();
			return employeeService;
		}
		return employeeService;
	}
	
	// private Employee employees[] = new Employee[10];
	
	static int counter=0;
	@Override
	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}
	
	public Employee getEmployeeById(String id) throws IdNotFoundException,IOException {
		return employeeRepository.getEmployeeById(id);
	}
	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
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
