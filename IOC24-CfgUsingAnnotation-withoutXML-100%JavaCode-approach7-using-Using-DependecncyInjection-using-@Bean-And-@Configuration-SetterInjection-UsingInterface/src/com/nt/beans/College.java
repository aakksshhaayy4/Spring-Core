package com.nt.beans;

import com.nt.interfce.Teacher;

public class College {

	private Principal principal;
	private Teacher teacher;

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void display() {
		principal.principalDetails();
		teacher.Teach();
	}

}
