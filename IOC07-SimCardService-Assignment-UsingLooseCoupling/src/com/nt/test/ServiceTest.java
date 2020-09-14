package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Service;
import com.nt.beans.SimCard;

public class ServiceTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		SimCard sim = ctx.getBean("simCard",SimCard.class);
		
		sim.ActivateService();
		

	}

}
