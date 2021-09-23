package com.cogent.employeemanagementsystem.model;
// import lombok.Data;

// @Data
public class Manager extends Employee {
	private String managerId; private float projectAllow;
	
	@Override
	public float calculateSalary() { return super.calculateSalary(); }
	
	public Manager() {
		this("","","",1000.0f,1000.0f,"");
		// fill in these fields by default if default constructor is called
		//	and thus no data values are given
		
		//System.out.println("Hello from Manager default constructor.");
	}
	
	public String getManagerId() { return managerId; }

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public float getProjectAllow() { return projectAllow; }

	public void setProjectAllow(float projectAllow) {
		this.projectAllow = projectAllow;
	}

	public Manager(String empId, String firstName,
			String lastName, float empSalary,
			float projectAllow, String managerId) {
		super(empId,firstName,lastName,empSalary/*123.0f*/); // gives a call to the superclass' constructor
	
		this.projectAllow=projectAllow;this.managerId="manager";
	}
}
