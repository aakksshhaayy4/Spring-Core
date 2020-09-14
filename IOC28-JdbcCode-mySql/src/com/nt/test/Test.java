package com.nt.test;

import java.sql.SQLException;

import com.nt.jdbc.FetchingAllRecordsFromMySqlDB;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		FetchingAllRecordsFromMySqlDB fetch = new FetchingAllRecordsFromMySqlDB();
		
		fetch.gettingRecords();
	}

}
