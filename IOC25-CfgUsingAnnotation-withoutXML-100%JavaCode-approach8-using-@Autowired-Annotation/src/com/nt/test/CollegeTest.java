package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.College;
import com.nt.cfgs.CollegeConfiguration;

public class CollegeTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CollegeConfiguration.class);
		System.out.println("This program is for configuring using 100% java using  @Autowired Annotation-Setter");
		College clg = ctx.getBean("collegeBean", College.class);
		clg.display();

	}

}
