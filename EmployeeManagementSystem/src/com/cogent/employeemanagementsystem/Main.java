package com.cogent.employeemanagementsystem;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
public class Main {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee("ab001","abhi","chivate","PA",123.0f);
		
		String result = employeeService.addEmployee(employee);
		System.out.println(result);
		
		//Employee employee=new Employee();
		// ClassName reference = object
		/*Employee employee2 = new Employee
				("ab001", "abhi", "chivate", "PA", 100.0f);
		Employee employee3 = null;*/
		//int a;
		//System.out.println(a);
		
		//System.out.println(employee2.getEmployeeId());
		/* System.out.println(employee2.getFirstName());
		System.out.println(employee2.getLastName());
		System.out.println(employee2.getAddress());
		System.out.println(employee2.getEmpSalary()); */
		
		//System.out.println(employee3.getEmployeeId());
		
		/* Employee employees[] = new Employee[10];
		for (int i = 0; i<employees.length; i++) {
			employees[i] = new Employee();
		}
		for (Employee employee4:employees) {System.out.println(employee4);}*/
	}

}
