package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.DbConnection;

public class DbConnectionTest {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
			
		DbConnection connection = ctx.getBean("conn",DbConnection.class);
		
		connection.checkCOnnection();
	}

}
