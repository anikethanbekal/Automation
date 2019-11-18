
//import everything testng.annotations not from junit else you'll get internal error popup
package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrioritizeMethod {
	WebDriver driver;
	//This method will execute before execution of class. It executes only once
	@BeforeClass
	public void beforeC()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		System.out.println("BC");
	}
	//This method will execute after execution of class. It executes only once
	@AfterClass
	public void afterC() {
		System.out.println("AC");
	}
	//This method will execute before every method
	@BeforeMethod
	public void beforeM() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("BM");
	}
	//This method will execute after every method
	@AfterMethod
	public void afterM()
	{
		driver.close();
		System.out.println("AM");
	}
	@Test(priority = 2)		
	public void demoM() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
		System.out.println("Priority2");
	}
	@Test(priority = 1)
	public void demoM1() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
		System.out.println("Priority1");
	}
}
