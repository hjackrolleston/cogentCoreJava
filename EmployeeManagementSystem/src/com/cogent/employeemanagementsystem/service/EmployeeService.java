package com.cogent.employeemanagementsystem.service;
import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id) throws IdNotFoundException,IOException;
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id) throws IdNotFoundException,IOException;
	public List<Employee> getEmployees();
	public String updateEmployees(String id, Employee employee);
	
	// new methods
	public boolean isEmployeeExists(String id);
}
