//config.properties is a file in project. THisprograms helps in data fetching instead of excel
package com.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig{
	@Test
	public void demo() throws IOException {
		Properties con = new Properties();
		FileInputStream fis = new FileInputStream("./config.properties");
		con.load(fis);
		String name = con.getProperty("browser");
		System.out.println(name);
	}
}
