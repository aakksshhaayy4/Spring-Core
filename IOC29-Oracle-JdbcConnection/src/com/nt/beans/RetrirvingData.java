package com.nt.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrirvingData {
	
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	private int sno;
	private String sname;
	private String address;
	
	
	public void getRecords() throws ClassNotFoundException, SQLException {
		
		//load the class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Establish the  ConnectioN 
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "hr", "hr");
		
		//Create Statement Object
		st = con.createStatement();
		
		//Execute the Query
		rs = st.executeQuery("Select * from employee");
		
		//process the resultSet
		while(rs.next()) {
			sno = rs.getInt(1);
			sname = rs.getString(2);
			address = rs.getString(3);
			
			System.out.println(sno+"  "+sname+"  "+address);
		}
		
	}

}
