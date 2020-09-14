package com.nt.pkd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class GetRecordsUsingXMl {

	Connection con;
	Statement st;
	ResultSet rs;

	private String driver;
	private String url;
	private String username;
	private String password;

	private int sno;
	private String sname;
	private String address;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("Inside the init method");
		System.out.println(".............................");
		DbConnection();

	}

	public void DbConnection() throws ClassNotFoundException, SQLException {
		// load the classs
		Class.forName(driver);

		// Establish the COnnection
		con = DriverManager.getConnection(url, username, password);

	}

	public void getRecords() throws ClassNotFoundException, SQLException {

		// create Statement Object
		st = con.createStatement();

		// Execute the Query
		rs = st.executeQuery("select * from student");

		// process the resultset
		while (rs.next()) {
			sno = rs.getInt(1);
			sname = rs.getString(2);
			address = rs.getString(3);

			System.out.println(sno + "  " + sname + "  " + address);
		}
	}
	@PreDestroy
	public void destroy() throws SQLException {
		System.out.println("..........................");
		System.out.println("Inside destroy method");
		closeConnection();
	}
	
	public void closeConnection() throws SQLException {
		con.close();
	}
}
