package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main4 {

	public static void main(String[] args) {
		EmployeeService employeeService=EmployeeServiceImpl.getInstance();
		String result=null;
		
		// TODO Auto-generated method stub
		Employee emc2 = new Employee("hw8943","Howard",
				"Pseudonym",10.00f);emc2.printDetails();
		try{result=employeeService.addEmployee(emc2);
			//emc2.setEmpSalary(12.00f);emc2.printDetails();
		}catch(Exception u){u.printStackTrace();}
		
		if("Success.".equals(result)) {System.out.println("We did it!");}
		
		
	}

}
