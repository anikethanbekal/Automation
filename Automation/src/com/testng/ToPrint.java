package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToPrint {
	//To print instead of sopln use Reporter.Log if we pass true then only it will be printed
	@Test	
	public void demo1() {
		Reporter.log("HI",true);
	}
	//here its false so it wont be printed but test case will be pass
	@Test
	public void demo2() {
		Reporter.log("HIIIIII",false);
	}
}
