package com.nt.beans;

public class College {

	private Principal principal;

	public void setPrincipal(Principal principal) {
		System.out.println("College.setPrincipal()");
		this.principal = principal;
	}

	public void display() {
		principal.principalDetails();
	}

}
