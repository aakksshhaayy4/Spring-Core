package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Sim;
import com.nt.classes.AirtelSim;
import com.nt.classes.VodafoneSim;

public class mobile {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/beans.xml");
	
		System.out.println("mobile.main()");
		
		Sim sim = ctx.getBean("sim",Sim.class);
		sim.calling();
		sim.browsing();
		
	}

}
