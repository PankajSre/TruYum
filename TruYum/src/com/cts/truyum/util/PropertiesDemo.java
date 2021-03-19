package com.cts.truyum.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		FileReader reader = new FileReader("database.properties");
		properties.load(reader);
		
		System.out.println(properties.getProperty("url"));
		

	}

}
