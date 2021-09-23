package com.cogent.employeemanagementsystem.model;
import lombok.Data;
import lombok.AllArgsConstructor;

//@Data
//@AllArgsConstructor
public /*final*/ class Employee {
	private String employeeId, firstName, lastName, address;
	// private String departmentId;
	private float empSalary;
	
	public Employee(String employeeId, String firstName, String lastName, float empSalary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
	}

	public Employee() {
		this.employeeId=""; //explicit default constructor
		System.out.println("Hello from Employee default constructor.");
	}
	
	public void printDetails() {
		System.out.println(firstName+", "+lastName+", "+employeeId+", "
				+empSalary);
		if (address!=null) {System.out.print(", "+address);}
	}
	
	public float calculateSalary() {
		return empSalary + 500; //the 500 is an added bonus
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

}
