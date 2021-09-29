/** "A List" implementation */
package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {
	
	private static EmployeeRepositoryALImpl instance = new EmployeeRepositoryALImpl();
	private EmployeeRepositoryALImpl() {}
	public static EmployeeRepositoryALImpl getInstance() {return instance;}
	
	// Can we get a Singleton DP? (Private noargs constructor)
	//private List<Employee> employees = new ArrayList<Employee>();
	//private Set<Employee> employees = new HashSet<>();
	//private List<Employee> employees=new LinkedList<Employee>();
	
	private Set<Employee> employees=new HashSet<>();
	//   ^changing this ArrayList to LinkedList (of no bracket type0
	//		will still allow program to function in normal working order
	
	// 10 employees - When we add 11th, size will auto-increase,
	//	because it's also a self-growable.
	// <Employee> ===> will hold only objects of bracketed type
	
	
	
	@Override
	public String addEmployee(Employee employee) {
		boolean status=employees.add(employee);
		if(status) return "Success";
		else return "Failure.";
	}
	/*public int getIndex(String id) {
		if ()
		}
	}*/
	
	/** address this later.....*/
	@Override
	public boolean isEmployeeExists(String id) {
		for (Employee emmp: employees) {
			if(id.equals(emmp.getEmployeeId())) {return true;}
		}return false;
	}
	
	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		Employee employee=this.getEmployeeById(id);
		if(employee!=null) {
			boolean status=employees.remove(employee);
			if(status) {return "Success.";}
		}return "Not found.";
	}

	@Override
	public void deleteAllEmployees() {
		employees.clear(); //return("Wiped clean.");
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
	public /*Employee[]*/List<Employee> getEmployees() {
		//Employee employee[]=new Employee[employees.size()];
		//return employees.toArray(employee);

		// need to work towards conversion of Set ==> List - why it's getting error
		//return employees;
		return new ArrayList<>(employees);
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
