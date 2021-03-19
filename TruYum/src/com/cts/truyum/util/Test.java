package com.cts.truyum.util;

import java.sql.Connection;

import com.cts.truyum.dao.ConnectionHandler;

public class Test {

	public static void main(String[] args) {
	
		Connection con = ConnectionHandler.getConnection();
		System.out.println(con.getClass());
	}

}
