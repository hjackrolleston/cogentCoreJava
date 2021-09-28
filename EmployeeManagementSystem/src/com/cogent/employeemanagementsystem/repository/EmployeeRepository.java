package com.cogent.employeemanagementsystem.repository;
import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeRepository {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException;
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException;
	public Employee getEmployeeByName(String fName,String lName);
	public Employee[] getEmployees();
	public Employee[] getEmployeesByName(String name);
	public String updateEmployees(String id, Employee employee);
}
