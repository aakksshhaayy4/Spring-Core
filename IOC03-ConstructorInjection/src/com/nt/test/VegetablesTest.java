package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vegetables;

public class VegetablesTest {

	public static void main(String[] args) {
		System.out.println("VegetablesTest.main()");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Vegetables veg = ctx.getBean("vegetables",Vegetables.class);
		veg.display();
		
	}

}
