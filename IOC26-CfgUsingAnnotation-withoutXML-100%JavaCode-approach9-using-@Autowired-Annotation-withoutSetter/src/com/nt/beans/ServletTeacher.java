package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.nt.interfce.Teacher;

@Component
public class ServletTeacher implements Teacher {

	
	@Override
	public void Teach() {
		System.out.println("Hey..Im your Servlet Teacher");

	}

}
