package com.cogent.employeemanagementsystem;
import java.util.HashSet;
import java.util.Set;

import com.cogent.employeemanagementsystem.model.Employee;

public class HashcodesHexstrings {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		System.out.println(Integer.toHexString(emp1.hashCode()));
		System.out.println(Integer.toHexString(emp2.hashCode()));
		System.out.println(Integer.toHexString(emp3.hashCode()));
		
		// Because all three object implementations
		//	of same object type are the same,
		// respective hashcodes are all the same
		
		Set<Employee> employees=new HashSet<>();
		
		
		employees.add(emp1);employees.add(emp2);employees.add(emp3);
		for (Employee emmp: employees) {
			System.out.println(emmp);
		}
		
		//System.out.println(emp1.equals(null));
		//System.out.println(emp2.equals(null));
		//System.out.println(emp3.equals(null));
		
		
	}

}
