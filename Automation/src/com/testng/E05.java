package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E05 {
	@Test(dependsOnMethods = {"demo1" , "demo3"})
	public void demo2() {
		Reporter.log("HI 2",true);
	}
	@Test
	public void demo3() {
		Reporter.log("HI 3",true);
	}
	@Test
	public void demo1() {
		Reporter.log("HI 1",true);
	}
	
}