package com.nt.beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class DbConnection {
	
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	public void display() {
		System.out.println(driver+" "+url+" "+username+" "+password);
	}
	
	public void checkCOnnection() throws Exception {
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		
		if(con!=null) {
			System.out.println("You are Not Connected");
		}
		else {
			System.out.println("You are Connected");
		}
				
	}
	

}
