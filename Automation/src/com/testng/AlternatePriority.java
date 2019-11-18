package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlternatePriority {
	@Test(dependsOnMethods  = "demo2")	
	public void demo1() {
		Reporter.log("HI",true);
	}
	@Test
	public void demo2() {
		Reporter.log("HIIIIII",true);
	}
}
