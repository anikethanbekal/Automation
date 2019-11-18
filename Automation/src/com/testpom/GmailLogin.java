package com.testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GmailLogin {
	static WebDriver driver;
	@BeforeMethod
	public void beforeMethod()	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		// opening the browser
		driver = new ChromeDriver();
		// Maximizing the browser
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	}
	@AfterMethod public void afterM() { driver.close(); }
	

	@Test
	public static void gmailLogin01() throws InterruptedException {
		try {
			com.pom.GmailLogin gl = new com.pom.GmailLogin(driver);
			gl.enterID("selenium.ty");
			Thread.sleep(2000);
			gl.clickNext();
			Thread.sleep(2000);
			gl.password("seleniumtest");
			gl.pclickNext();
		} catch (Exception e) {
			Reporter.log("Its Exception");
			Assert.fail();
		}
	}
	@Test
	public static void gmailLogin02() throws InterruptedException {
		try {
			com.pom.GmailLogin gl = new com.pom.GmailLogin(driver);
			gl.enterID("  995*/-+fsd");
			Thread.sleep(2000);
			gl.clickNext();
			Thread.sleep(2000);
			gl.password("selenium");
			gl.pclickNext();
		} catch (Exception e) {
			Reporter.log("Its Exception");
		}
	}
	@Test
	public static void gmailLogin03() throws InterruptedException {
		try {
			com.pom.GmailLogin gl = new com.pom.GmailLogin(driver);
			gl.enterID("s");
			Thread.sleep(2000);
			gl.clickNext();
			Thread.sleep(2000);
			gl.password("seleniumtest");
			gl.pclickNext();
		} catch (Exception e) {
			Reporter.log("Its Exception");
		}
	}
	
	@Test
	public static void gmailLogin04() throws InterruptedException {
		try {
			com.pom.GmailLogin gl = new com.pom.GmailLogin(driver);
			gl.enterID(" ");
			Thread.sleep(2000);
			gl.clickNext();
			Thread.sleep(2000);
			gl.password(" ");
			gl.pclickNext();
		} catch (Exception e) {
			Reporter.log("Its Exception");
			Assert.fail();
		}
	}
}
