package com.nt.classes;

import com.nt.beans.Sim;

public class TelecomSim implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling With Telecom Sim");

	}

	@Override
	public void browsing() {
		System.out.println("Browsing With Telecom Sim");

	}

}
