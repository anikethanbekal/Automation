//Login to Actitime web with valid admin details
package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the Actitime url
		driver.navigate().to("https://demo.actitime.com/login.do");
		//Selecting username field and entering details
		driver.findElement(By.id("username")).sendKeys("admin");
		//Selecting password field and entering details
		driver.findElement(By.cssSelector("input[name = 'pwd']")).sendKeys("manager");
		Thread.sleep(1000); 
		//clicking login button
		driver.findElement(By.cssSelector("a[id = 'loginButton']")).click();
		Thread.sleep(1000);
	}
}
