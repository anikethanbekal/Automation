package com.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GmailDraft {
	@Test
	public void Draft() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");

		// Opening the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
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
		//click on compose button
		driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
		Thread.sleep(2000);
		//enter recipient address
		driver.findElement(By.xpath("//textarea[@name=\"to\"]")).sendKeys("abc");;
		Thread.sleep(2000);
		String sub = "HIII";
		//enter the subject
		driver.findElement(By.xpath("//input[@name=\"subjectbox\"]")).sendKeys(sub);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Reporter.log(driver.findElement(By.xpath("//input[@name=\"subjectbox\"]")).getText());
		//System.out.println("Before: "+sub.getText());
		Thread.sleep(2000);
		//enter the text body
		driver.findElement(By.xpath("//div[@class=\"Am Al editable LW-avf tS-tW\"]")).sendKeys("Welcome TO Gmail/n This is automated");
		Thread.sleep(2000);
		//click on close button
		driver.findElement(By.xpath("//img[@class=\"Ha\"]")).click();
		Thread.sleep(5000);
		//click on draft link 
		 driver.findElement(By.xpath("//span/a[@title=\"Drafts\"]")).click();
		 Thread.sleep(5000);
		 //click on first link
		driver.findElement(By.xpath("//tr[@class=\"zA yO\"]")).click();
		Thread.sleep(2000);
		WebElement sub2 = driver.findElement(By.xpath("//div{@class]"));
		System.out.println("After: "+sub2.getText());
		Assert.assertEquals(sub, sub2);
	}
}
