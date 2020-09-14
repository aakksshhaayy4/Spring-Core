package com.nt.beans;

public class Vegetables {
	
	private String vegName;
	private float price;
	
	public Vegetables(String vegName, float price) {
		System.out.println("Vegetables.Vegetables()");
		this.vegName = vegName;
		this.price = price;
	}

	
	public void display() {
		System.out.println("Vegetable Name is : "+vegName+" and Price of "+vegName+" is "+price);
	}
	
	

}
