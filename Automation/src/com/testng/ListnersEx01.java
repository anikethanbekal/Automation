package com.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListnersEx01 {
	@Listeners(ListnersC.class)
	public class DdemoListtimplClass{
		@Test
		public void demo()
		{
			System.out.println("ABC1");
		}
		@Test
		public void demo1()
		{
			System.out.println("ABC2");
			Assert.fail(); // To fail a test 
		}
	}
	
}
