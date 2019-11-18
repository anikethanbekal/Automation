//we use soft assert if the exception occurs then it will execute all the lines and we will get pass
//assertall is used to print the report
package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertP {
	@Test
	public void test() {
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(9, 19);
	Reporter.log("This is after fail"); //This line will be printed since we used SoftAssert
	sa.assertAll(); //This is to get report after the line13-statement we get all the report
	}
}
