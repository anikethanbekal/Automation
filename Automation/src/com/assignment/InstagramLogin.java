package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Opening the Chrome browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the Instagram url
		driver.navigate().to("https://www.instagram.com/accounts/login/?source=auth_switcher");
		//Selecting username field and entering details
		driver.findElement(By.cssSelector("input[class='_2hvTZ pexuQ zyHYP']")).sendKeys("9738802889");
		//Selecting password field and entering details
		//driver.findElement(By.cssSelector("input[name = 'pwd']")).sendKeys("manager");
		//Thread.sleep(1000); 
		//clicking login button
		//driver.findElement(By.cssSelector("a[id = 'loginButton']")).click();
		//Thread.sleep(1000);
	}
}
