package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.nt.interfce.Teacher;

@Component
public class JavaTeacher implements Teacher {

	@Override
	public void Teach() {
		System.out.println("JavaTeacher.Teach()");
		System.out.println("Hey Im your Java Teacher");
		
	}
	
	

}
