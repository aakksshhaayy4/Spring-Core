package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.interfce.Teacher;

public class College {

	private Principal principal;
	private Teacher teacher;

	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void display() {
		principal.principalDetails();
		teacher.Teach();
	}

}
