package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.interfce.Teacher;

public class College {

	@Autowired
	private Principal principal;

	@Autowired
	private Teacher teacher;

	

	public void display() {
		principal.principalDetails();
		teacher.Teach();
	}

}
