package com.nt.classes;

import com.nt.beans.Sim;

public class VodafoneSim implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling With Vodafone Sim");

	}

	@Override
	public void browsing() {
		System.out.println("Browsing With Vodafone Sim");

	}

}
