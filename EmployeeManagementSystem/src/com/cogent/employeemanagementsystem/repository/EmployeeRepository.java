package com.cogent.employeemanagementsystem.repository;
import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeRepository {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id);
	public Employee getEmployeeByName(String fName,String lName);
	public Employee[] getEmployees();
	public String updateEmployees(String id, Employee employee);
}
