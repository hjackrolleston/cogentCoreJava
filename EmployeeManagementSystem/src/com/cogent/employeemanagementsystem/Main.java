package com.cogent.employeemanagementsystem;
import com.cogent.employeemanagementsystem.model.Employee;
import java.util.Scanner;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;
public class Main {

	public static void main(String[] args) {
		
		// switch case to handle all options:
		/*
		 * 1) add
		 * 2) get emp by id
		 * 3) delete
		 * 4) update
		 * 5) getall
		 * 6) exits
		 * */
		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		Employee emp1=new Employee("ab001","Abhi","Chivate",123.00f);
		Employee emp2=new Employee("ja454","Jason","Richards",123.00f);
		Employee emp3=new Employee("re994","Reggie","Knox",122.00f);
		Employee emp4=new Employee("ja522","Janice","Bronson",112.00f);
		Employee emp5=new Employee("am933","Amber","Reina",126.00f);
		Employee emp6=new Employee("ca989","Carl","Norris",103.00f);
		Employee emp7=new Employee("ch943","Charles","Garrison",103.00f);
		
		String result = employeeService.addEmployee(emp1);
		String re2 = employeeService.addEmployee(emp2);
		String re3 = employeeService.addEmployee(emp3);
		String re4 = employeeService.addEmployee(emp4);
		String re5 = employeeService.addEmployee(emp5);
		String re6 = employeeService.addEmployee(emp6);
		//System.out.println(result);
		
		Employee[] employees = employeeService.getEmployees(); employeeService.showNameList();
		System.out.println("===================\n\n");
		
		System.out.println(employeeService.deleteEmployeeById("am933"));
		
		employeeService.showNameList();
		
		
		// Updating the record for an employee who got a raise
		employeeService.getEmployees()[3].printDetails();
		emp4 = new Employee("ja522","Janice","Bronson",150.00f);
		employeeService.updateEmployees("ja522",emp4);
		employeeService.getEmployees()[3].printDetails();
		
		Scanner sc = new Scanner(System.in);System.out.println("Enter an employee's first name...");
		String fN = sc.next();System.out.println("Last name...");String lN=sc.next();
		Employee searched=employeeService.getEmployeeByName(fN,lN);
		if(searched!=null) {searched.printDetails();}
	}

}
