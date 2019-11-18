package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("xyz");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String attribute = driver.findElement(By.xpath("(//span[contains(text(),'')])[1]")).getAttribute("class");
		System.out.println(attribute);
		String color = driver.findElement(By.xpath("(//span[contains(text(),'')])[1]")).getCssValue("color");
		System.out.println(color);
		driver.close();
	}
}
