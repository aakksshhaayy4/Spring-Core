package com.nt.beans;

public class SimCard {
	
	private Service service;
	
	
	public void setService(Service service) {
		this.service = service;
	}


	public void ActivateService() {
		service.service();
		
	}

}
