package com.nt.beans;

public class Rider2 {
	
	private int riderId;
	private String riderName;
	private Race race;
	
	public void setRiderId(int riderId) {
		this.riderId = riderId;
	}

	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public void Race() {
		race.Riding();
		System.out.println("Second Winner Of this Race.. RiderId is : "+riderId+" Rider Name is : "+riderName);
		System.out.println("..Race is ended..");
	}
	

}
