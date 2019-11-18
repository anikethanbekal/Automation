package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlternateInvocation {
	@Test(enabled = false)
	public void demo1() {
		Reporter.log("HI 1",true);
	}
	@Test(enabled = true)
	public void demo2() {
		Reporter.log("HI 2",true);
	}
}
