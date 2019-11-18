 package com.testng;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class GmailListeners {
	@Listeners(ListnersC.class)
	public class DdemoListtimplClass{
	@Test
	public void gmailLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the url
		driver.navigate().to("https://www.gmail.com/");
		//enter username
		driver.findElement(By.cssSelector("input[id ='identifierId']")).sendKeys("selenium.ty");
		//click next
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		//enter password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("seleniumtest");
		Thread.sleep(2000);
		//click on next
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equalsIgnoreCase("Inbox (2) - selenium.ty@gmail.com - Gmail")) {
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Invalid");
			Assert.fail();
		}
		
	}
	}
}