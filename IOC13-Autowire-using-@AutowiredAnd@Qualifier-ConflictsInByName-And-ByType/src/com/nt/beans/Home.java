package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Home {
	
	@Autowired
	@Qualifier("newMembers")
	private Members member;
	
	public Home() {
		
	}
	
	public Home(Members member) {
		this.member = member;
	}

	public void setMember(Members member) {
		this.member = member;
		System.out.println("Home.setMember()");
	}

	public void familyMembers() {
		member.allMember();
		System.out.println("Member Name Is : "+member.getName()+" and the age is : "+member.getAge());
	}

}
