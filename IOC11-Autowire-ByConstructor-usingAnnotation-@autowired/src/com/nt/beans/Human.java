package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	
	public Human() {
		
	}
	
	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("AutoWire-ByConstructor by using Annotation : @autowired");
	}

	public void startPumping() {
		heart.pumping();
	}
}
