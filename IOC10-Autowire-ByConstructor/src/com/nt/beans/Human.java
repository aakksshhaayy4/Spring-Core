package com.nt.beans;

public class Human {

	private Heart heart;

	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("AutoWire-ByConstructor");
	}

	public void startPumping() {
		heart.pumping();
	}
}
