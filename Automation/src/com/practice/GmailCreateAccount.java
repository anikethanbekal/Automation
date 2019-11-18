package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailCreateAccount {
	@Test
	public void createAccount() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		// Opening the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the url
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(2000);
		// click create new account
		driver.findElement(By.xpath("//span[@class=\"NlWrkb snByac\"]")).click();
		Thread.sleep(2000);
		//click on myself
		driver.findElement(By.xpath("//div[@jsname=\"RZzeR\"]/div[@class=\"jO7h3c\"]")).click();
		Thread.sleep(2000);
		//enter first name
		 driver.findElement(By.id("firstName")).sendKeys("Anikethan");
		//enter Last name
		 driver.findElement(By.id("lastName")).sendKeys("B");
		//enter username
		 driver.findElement(By.id("username")).sendKeys("anikethanb2019");
		//enter password
		 driver.findElement(By.name("Passwd")).sendKeys("testyantra");
		//enter password
		 driver.findElement(By.name("ConfirmPasswd")).sendKeys("testyantra");
		 //click next
		 driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]")).click();
		 //enter phone no
		 driver.findElement(By.id("phoneNumberId")).sendKeys("7019848539",Keys.ENTER);
	}
}
