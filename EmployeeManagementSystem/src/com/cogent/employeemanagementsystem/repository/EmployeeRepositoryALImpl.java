/** "A List" implementation */
package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {
	
	private static EmployeeRepositoryALImpl instance = new EmployeeRepositoryALImpl();
	private EmployeeRepositoryALImpl() {}
	public static EmployeeRepositoryALImpl getInstance() {return instance;}
	
	// Can we get a Singleton DP? (Private noargs constructor)
	
	private ArrayList<Employee> employees=new ArrayList<Employee>();
	// 10 employees - When we add 11th, size will auto-increase,
	//	because it's also a self-growable.
	// <Employee> ===> will hold only objects of bracketed type
	
	
	
	@Override
	public String addEmployee(Employee employee) {
		boolean status=employees.add(employee);
		if(status) return "Success";
		else return "Failure.";
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		// 1) Traverse the arraylist
		for(Employee emmp: employees) {
			if(id.equals(emmp.getEmployeeId()))
				return emmp;
		}
		// 2) Use Java8 features
		return null;
	}

	@Override
	public Employee getEmployeeByName(String fName, String lName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployees(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
