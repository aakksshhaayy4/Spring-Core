package com.nt.classes;

import com.nt.beans.Sim;

public class JioSim implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling With Jio Sim");

	}

	@Override
	public void browsing() {
		System.out.println("Browsing With Jio Sim");

	}

}
