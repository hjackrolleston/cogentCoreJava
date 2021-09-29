package com.cogent.employeemanagementsystem.repository;
import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeRepository {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException;
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException;
	public Employee getEmployeeByName(String fName,String lName);
	public List<Employee> getEmployees();
	public Employee[] getEmployeesByName(String name);
	public String updateEmployees(String id, Employee employee);
	
	// Some newer methods to implement.....
	public boolean isEmployeeExists(String id);
	// Whenever method returns a boolean, name
	//	conventionally should start with "is-", even
	//	where this makes absolutely no sense in
	//	english language grammar.
}
