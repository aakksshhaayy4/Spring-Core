package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingAllRecordsFromMySqlDB {

	Connection con = null;
	Statement st = null;
	ResultSet rs = null;

	int no = 0;
	String sname = null;
	String address = null;

	public void gettingRecords() throws ClassNotFoundException, SQLException {
		// Register JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the Connection
		con = DriverManager.getConnection("jdbc:mysql:///database1", "root", "root");

		// Create Statement Object
		st = con.createStatement();

		rs = st.executeQuery("SELECT * FROM database1.student;");

		while (rs.next()) {

			no = rs.getInt(1);
			sname = rs.getString(2);
			address = rs.getString(3);

			System.out.println(no + "     " + sname + "      " + address);

		}

	}
}
