package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Student student = ctx.getBean("student",Student.class);
		student.displayStudentInfo();
		
		/*
		 * Student student2 = ctx.getBean("info",Student.class);
		 * student2.displayStudentInfo();
		 */
		

	}

}
