package com.nt.beans;

public class Rider1 {
	
	private int riderId;
	private String riderName;
	private Race race;
	
	public void setRiderId(int riderId) {
		this.riderId = riderId;
	}

	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	public void setRider(Race race) {
		this.race = race;
	}

	public void Race() {
		System.out.println("....Race is Started.... ");
		race.Riding();
		System.out.println("Winner Of this Race.. RiderId is : "+riderId+" RiderName is : "+riderName);
		
	}

}
