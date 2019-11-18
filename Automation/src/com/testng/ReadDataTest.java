package com.testng;

import org.testng.annotations.Test;

public class ReadDataTest {
	@Test(dataProviderClass = ReadDataXmlData.class, dataProvider="CreateUser")
	public void test(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);	
	}
}
