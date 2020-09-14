package com.nt.classes;

import com.nt.beans.Sim;

public class AirtelSim implements Sim {
	
	public AirtelSim() {
		System.out.println("AirtelSim:0-Param Constructor");
	}

	@Override
	public void calling() {
		System.out.println("Calling With Airtel Sim");

	}

	@Override
	public void browsing() {
		System.out.println("Browsing With Airtel Sim");

	}

}
