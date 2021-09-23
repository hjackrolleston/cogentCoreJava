package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.model.Manager;
import com.cogent.employeemanagementsystem.model.ProjectManager;

public class InheritanceDemo {
	public static final float  PI = 3.14f;
	public final int a; public int b;
	
	public InheritanceDemo() {
		this.a=0;
	}
	
	public static final void main(String[] args) {
		final int b = 100;
		System.out.println(b);
		//Employee manager = new Manager();
		
		// Parent type : Child type
		//System.out.println("emp id"+manager.getEmpSalary());
		
		//float salary=manager.calculateSalary();System.out.println(salary);
		//Manager manager=new Manager("ab001","abhi","chivate",);
		//System.out.println();
		
		/* System.out.println(salary);
		System.out.println(manager.calculateSalary());
		
		Manager manager2 = (Manager) manager;
		System.out.println(manager2.getProjectAllow()); */
		
		//ProjectManager pm = new ProjectManager();
		// E + M = PM
		//Manager pm = new ProjectManager();
	}
}
