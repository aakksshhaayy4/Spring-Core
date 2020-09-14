package com.nt.beans;

public class Human {
	
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("AutoWire-ByType");
	}
	
	public void startPumping() {
		heart.pumping();
	}
}
