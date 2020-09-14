package com.nt.test;

import org.springframework.beans.factory.aspectj.AnnotationBeanConfigurerAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Shop;
import com.nt.cfgs.ConfigurationClasss;

public class TestApplication {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClasss.class);

		Shop sh = ctx.getBean("raut", Shop.class);
		System.out.println("The Class Which we used in that perticular program is : " + sh);
		sh.shopping();

	}

}
