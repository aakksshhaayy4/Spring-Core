package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.College;
import com.nt.beans.JavaTeacher;
import com.nt.beans.Principal;
import com.nt.beans.ServletTeacher;
import com.nt.interfce.Teacher;

@Configuration

public class CollegeConfiguration {
	@Bean
	public Teacher JavaTeacherBean() {
		return new JavaTeacher();
		
	}
	
	@Bean
	public Teacher ServletTeacherBean() {
		return new ServletTeacher();
	}
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		College college = new College();
		
		return college;
		
	}
	

}
