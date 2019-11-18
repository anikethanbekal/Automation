//example to show @Test depends on alphabetical order
package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E04 {
	@Test
	public void demo2() {					//This executes 2
		Reporter.log("HI 2",true);
	}
	@Test
	public void demo3() {					//This executes 3
		Reporter.log("HI 3",true);
	}
	@Test
	public void demo1() {					//This executes 1
		Reporter.log("HI 1",true);
	}
}
