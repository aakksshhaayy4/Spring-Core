package com.nt.beans;

public class Student {
	
	private String name;
	private String course;
	private float fees;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public void getDetails() {
		System.out.println("This program is for Getting values from Properties file ");
		System.out.println("..................................");
		System.out.println("Student details given Below : ");		
		System.out.println("Student name is : "+name);
		System.out.println("Student fav. Course is : "+course);
		System.out.println("Course fees is : "+fees);
	}

}
