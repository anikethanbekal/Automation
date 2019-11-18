package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the Yahoo url
		driver.navigate().to("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("anikethanbekal");
		//Selecting username field and entering details
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("anikethanbekal");
		//Selecting password field and entering details
		//driver.findElement(By.id("login-passwd")).sendKeys("1234567890");
		//Thread.sleep(1000); 
		//clicking login button
		//driver.findElement(By.cssSelector("input [name = 'password']")).sendKeys("1234567890");
		//Thread.sleep(1000);
	}
}

