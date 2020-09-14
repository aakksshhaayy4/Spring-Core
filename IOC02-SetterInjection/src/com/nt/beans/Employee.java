package com.nt.beans;

public class Employee {
	
	private String empName;
	private String address;
	private int empId;
	private float salary;
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("....Employee Information....");
		System.out.println("Employee Id is : "+empId);
		System.out.println("Employee Name is : "+empName);
		System.out.println("Employee Address is : "+address);
		System.out.println("Employee Salary is : "+salary);
		
	}
	

}
