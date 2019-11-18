//Myntra login pop up appears
package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the Myntra url
		driver.navigate().to("https://www.myntra.com/login?referer=https://www.myntra.com/");
		//Selecting username field and entering details
		driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("9738802889");
		//Selecting password field and entering details
		driver.findElement(By.cssSelector("input [name = 'password']")).sendKeys("1234567890");
		Thread.sleep(1000); 
		//clicking login button
		//driver.findElement(By.cssSelector("div [class = '_1avdGP']")).click();
		//Thread.sleep(1000);
	}
}
