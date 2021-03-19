package com.cts.truyum.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {

	public static Connection getConnection() {

		try {
			Properties properties = new Properties();

			FileReader reader = new FileReader("database.properties");
			properties.load(reader);
			String url = properties.getProperty("url");
			String user = properties.getProperty("username");
			String password = properties.getProperty("password");
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
}
