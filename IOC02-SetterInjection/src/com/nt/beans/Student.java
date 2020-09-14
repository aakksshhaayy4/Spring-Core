package com.nt.beans;

public class Student {
	
	private String studentName;
	private String Address;
	private int sno;
	private float marks;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void displayStudentInfo() {
		System.out.println("....Student Information....");
		System.out.println("Student Number is : "+sno);
		System.out.println("Student name is : "+studentName);
		System.out.println("Student Address is : "+Address);
		System.out.println("Student Marks is : "+marks);
	}
	

}
