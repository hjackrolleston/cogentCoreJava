package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepository {
	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepository employeeRepository;
	private EmployeeRepository() {}
	
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository=new EmployeeRepository();
			return employeeRepository;
		} return employeeRepository;
	}
	
	static int counter=0;
	public String addEmployee(Employee employee) {
		if (counter>=employees.length) {
			return"array is full";
		}employees[++counter]=employee;return "success";
	}
	
	public Employee getEmployeeById(String id) {
		for(Employee employee: employees) {
			if(employee!=null&&id.equals(employee.getEmployeeId())) {return employee;}
		} return null;
	}
}
