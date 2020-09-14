package com.nt.test;

import java.sql.SQLException;

import com.nt.beans.RetrirvingData;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		RetrirvingData rd = new RetrirvingData();
		
		rd.getRecords();

	}

}
