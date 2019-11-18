package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	@Test(groups = "smoke")
	public void demo2() {
		Reporter.log("HI 2",true);
	}
	@Test(dependsOnGroups = "smoke")
	public void demo3() {
		Reporter.log("HI 3",true);
	}
	@Test(groups = "smoke")
	public void demo1() {
		Reporter.log("HI 1",true);
	}
	
}