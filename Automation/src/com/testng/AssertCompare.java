//In this we use to compare two sets or strings or int etc.....
package com.testng;

import java.util.HashSet;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertCompare {
	@Test
	public void test() {
	HashSet s1 = new HashSet();
	s1.add("HI");
	s1.add("5236");
	s1.add(12345);
	HashSet s2 = new HashSet();
	s2.add("HI");
	s2.add("5236");
	s2.add(12345);
	Assert.assertEquals(s1, s2);
	}
}
