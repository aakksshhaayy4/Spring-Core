package com.nt.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.pkd.GetRecordsUsingXMl;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		System.out.println("Spring bean Life cycle Using Xml Approach");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		GetRecordsUsingXMl gtc = ctx.getBean("getRecords",GetRecordsUsingXMl.class);
		
		gtc.getRecords();
		gtc.destroy();
	
	}

}
