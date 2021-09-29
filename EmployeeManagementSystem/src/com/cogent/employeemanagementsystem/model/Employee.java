package com.cogent.employeemanagementsystem.model;
import lombok.Data;

import java.util.Objects;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

import lombok.AllArgsConstructor;

//@Data
//@AllArgsConstructor
public class Employee {
	@Override
	public int hashCode() {
		return Objects.hash(address, empSalary, employeeId, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // Reflexive condition
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address)
				&& Float.floatToIntBits(empSalary) == Float.floatToIntBits(other.empSalary)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}
	private String employeeId, firstName, lastName, address;
	// private String departmentId;
	private float empSalary;
	
	public Employee(String employeeId, String firstName, String lastName, float empSalary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.empSalary = empSalary;
		this.setEmpSalary(empSalary);
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
	public void setEmpSalary(float empSalary)throws InvalidSalaryException {
		if (empSalary>0) {this.empSalary = empSalary;}
		else {throw new InvalidSalaryException("Salaries can't be negative.");}
	}

}
