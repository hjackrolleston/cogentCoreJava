package com.cogent.employeemanagementsystem;
import java.lang.Exception;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;
import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;

import java.util.LinkedHashSet;
import java.util.Scanner;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
	

	
	// Better old code
	/*public static int division(int a,int b) {
		int c=0;
		try {
			c=a/b;return c;
		} catch (NullPointerException e) {/*return -1;*///}
		// create an Exception object
		/*finally{System.out.println("After catch block.");}return -1;
		
	}*/
	
	//more good old code: 
	
	public static void main(String[] args) {
		
		//Employee emmp = new Employee("ab001", "Abhi", "Chivate", 123.00f);
		EmployeeService serv = EmployeeServiceImpl.getInstance();
		Employee emp1=null;
		try {
			emp1 = new Employee("ab001", "Abhi", "Chivate", 123.00f);
			System.out.println(serv.addEmployee(emp1));
		}catch(InvalidSalaryException e) {e.printStackTrace();}
		//System.out.println(emp1.hashCode());
		
		Employee emp2=null;
		try {emp2=new Employee("ad001","Advik","Chivate",10000.0f);}
		catch(InvalidSalaryException e){e.printStackTrace();}
		
		Employee emp3=null;
		try {emp3=new Employee("ab002","Abhi","Chivate",1000000.0f);}
		catch(InvalidSalaryException e){e.printStackTrace();}
		
		System.out.println(Integer.toHexString(emp1.hashCode()));
		System.out.println(Integer.toHexString(emp2.hashCode()));
		System.out.println(Integer.toHexString(emp3.hashCode()));
		
		Set<Employee> employees=new LinkedHashSet<>();
		employees.add(emp1);employees.add(emp2);employees.add(emp3);
		for(Employee emmp:employees) {System.out.println(emmp);}
		/* try {
			FileOutputStream fOS = new FileOutputStream("abc.txt");
			fOS.write("abc".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*System.out.println("All is well.");
		try {String s=null;System.out.println(s.concat("Abhi"));}*/
		// Each Exception type is a subclass of supertype
		// Exception, meaning more specific exception types
		// should be called BEFORE the general Exception
		// supertype is called
		/*catch(ArithmeticException a) {}
		catch(NullPointerException n) {}
		catch(RuntimeException r) {}
		catch (Exception e) {System.out.println("Exception caught.");
			System.out.println(e.getClass().getName());
		}
		
		catch (Throwable t)  {}*/ // Throwable being the supertype of all Exceptions
		
		// That's a negative - Objects cannot be
		// caught/thrown, as they're not Throwable;
		// Object is supertype, not subtype, of Throwable
		//catch (Object o) {}
		
		/*int result=division(10,5);
		System.out.println(result); */
		
		// Worse older code
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter data (should be integers): ");
		//int a=sc.nextInt();int b=sc.nextInt();
		int a=1; int b=1; */
		/* System.out.println(a);System.out.println(b);*/  //int c=1;
		
		/*try {
			a=sc.nextInt();b=sc.nextInt();System.out.println(a);
			System.out.println(b); c=a/b;
		} catch (Exception e) {System.out.println("Code stopped "
				+ "on exception; result of operated-upon inputs "
				+"could not be resolved to type int.");}
		finally {System.out.println("Inside the finally block. ");}
		
		
		System.out.println("Division is " +c); */
		// switch case to handle all options:
		/*
		 * 1) add
		 * 2) get emp by id
		 * 3) delete
		 * 4) update
		 * 5) getall
		 * 6) exits
		 * */
		
		/* EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
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
		
		employeeService.showNameList(); */
		
		
		// Updating the record for an employee who got a raise
		/* employeeService.getEmployees()[3].printDetails();
		emp4 = new Employee("ja522","Janice","Bronson",150.00f);
		employeeService.updateEmployees("ja522",emp4);
		employeeService.getEmployees()[3].printDetails();
		
		Scanner sc = new Scanner(System.in);System.out.println("Enter an employee's first name...");
		String fN = sc.next();System.out.println("Last name...");String lN=sc.next();
		Employee searched=employeeService.getEmployeeByName(fN,lN);
		if(searched!=null) {searched.printDetails();} */
	}

}
