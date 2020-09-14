package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.College;
import com.nt.beans.Principal;

@Configuration
public class CollegeConfiguration {
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(principalBean());
		return college;
		
	}
	

}
