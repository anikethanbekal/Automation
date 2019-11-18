package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample02 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the Twitter url
		driver.navigate().to("https://epaper.thehindu.com/login");
		Thread.sleep(3000);
		//Selecting username field and entering details
		driver.findElement(By.id("txtNumber1")).sendKeys("bekalanikethan");
		Thread.sleep(3000);
		//Selecting password field and entering details
		driver.findElement(By.id("txtPassword")).sendKeys("11111111112");
		Thread.sleep(3000);
		//Thread.sleep(1000); 
		//clicking login button
		driver.findElement(By.className("btn btn-signup")).click();
		//Thread.sleep(1000);
	}
}
