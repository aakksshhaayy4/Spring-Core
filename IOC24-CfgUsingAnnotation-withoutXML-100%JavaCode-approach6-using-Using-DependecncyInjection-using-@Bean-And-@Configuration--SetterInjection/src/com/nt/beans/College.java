package com.nt.beans;

public class College {
	
	private Principal principal;

	public College(Principal principal) {
		this.principal = principal;
	}
	
	public void display() {
		principal.principalDetails();
	}
	
	

}
