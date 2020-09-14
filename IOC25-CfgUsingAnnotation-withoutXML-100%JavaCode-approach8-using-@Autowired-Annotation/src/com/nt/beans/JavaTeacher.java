package com.nt.beans;

import com.nt.interfce.Teacher;

public class JavaTeacher implements Teacher {

	@Override
	public void Teach() {
		System.out.println("JavaTeacher.Teach()");
		System.out.println("Hey Im your Java Teacher");
		
	}
	
	

}
