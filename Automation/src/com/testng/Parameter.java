package com.testng;

import org.testng.annotations.Test;

public class Parameter {
	@Test(invocationCount = 5)		
	public void demoM() {
		System.out.println("1");
	}
	@Test(priority = -2)
	public void demo1()
	{
		System.out.println("Its Priority is -2");
	}
	@Test(priority = 1,invocationCount = 2)
	public void demo2()
	{
		System.out.println("Its Priority is 1,invocationCount =2");
	}
	@Test(invocationCount = 0)
	public void demo3()
	{
		System.out.println("Its from invocationCount=0");
	}

}