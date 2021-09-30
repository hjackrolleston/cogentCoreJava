package com.cogent.employeemanagementsystem;
import java.util.Comparator;
import java.util.TreeSet;
//import java.lang.Comparable;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;

public class TreeSetDemo {
	public static void main(String[] args) {
		Comparator<Employee> comparator=new Comparator<Employee>() {
		//anonymous inner class
		@Override
			public int compare(Employee o1, Employee o2) {
			//if(o1.getEmpSalary()>o2.getEmpSalary()) {return 1;}else {return-1;}
			return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			//return 0;
			}
		};
		Comparator<Employee> comparator2=new Comparator<Employee>() {
			@Override
			public int compare(Employee o1,Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
}
		};
		
		TreeSet<Employee> employees = new TreeSet<>(comparator);
		//TreeSet<String> set2 = new TreeSet<>();
		//TreeSet<String> set3 = new TreeSet<String>();
		
		/*
		 * set.add("Abhi");set.add("Howard"); set.add("Levi"); set.add("Angi");
		 * set.add("Omer"); set.add("Greg"); set.add("Kashif"); set.add("Murtaza");
		 * set.add("Yuta"); set.add("Shaotong"); set.add("Anthony");
		 * set.add("Akshajyot");
		 */
		
		try {
			employees.add(new Employee("ab001","Abhi","Chivate",10000.0f));
			employees.add(new Employee("ab005","Advik","Chivate",5000.0f));
			employees.add(new Employee("ab010","Abhinandan","Chivate",10000.0f));
			//employees.remove(new Employee("ab010","Abhinandan","Chivate",10000.0f));
			
			for(Employee b: employees) {
				if (b.equals(new Employee("ab010","Abhinadan","Chivate",10000.0f))) {
					employees.remove(b);
				}
			}
			for (Employee a :employees) {System.out.println(a);}
		} catch(InvalidSalaryException e) {System.out.println("Exception caught. "+e);}
		catch(ClassCastException e) {System.out.println("Exception caught. "+e);}
		
	}

}
