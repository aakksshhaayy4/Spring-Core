package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	
	public Human() {
		
	}
	
	
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("AutoWire-ByConstructor by using Annotation : @autowired");
	}
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Changing Constructor injection to Setter Injection");
		System.out.println("AutoWire by using setter Method -- using @AutoWired Annotation");
	}

	public void startPumping() {
		heart.pumping();
	}
}
