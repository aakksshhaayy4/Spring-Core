package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Rider1;
import com.nt.beans.Rider2;

public class RaceTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Rider1 rider1 = ctx.getBean("rider1",Rider1.class);
		rider1.Race();
		
		Rider2 rider2 = ctx.getBean("rider2",Rider2.class);
		rider2.Race();

	}

}
