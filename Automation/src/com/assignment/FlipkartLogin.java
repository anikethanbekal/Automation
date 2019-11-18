// login to flipkart with invalid password
package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the flipkart url
		driver.navigate().to("https://www.flipkart.com/");
		//Selecting username field and entering details
		driver.findElement(By.cssSelector("input[class = '_2zrpKA _1dBPDZ']")).sendKeys("9738802889");
		//Selecting password field and entering details
		driver.findElement(By.cssSelector("input[class = '_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("1234567890");
		Thread.sleep(1000); 
		//clicking login button
		driver.findElement(By.cssSelector("div [class = '_1avdGP']")).click();
		Thread.sleep(1000);
	}
}
