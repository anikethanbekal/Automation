package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHindi {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		// open the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String hindi = driver.findElement(By.xpath("//div[@id=\"SIvCob\"]/a[1]")).getText();
		driver.findElement(By.name("q")).sendKeys(hindi);
		driver.findElement(By.xpath("//li[@class=\"sbct\"][3]")).click();
		Thread.sleep(2000);
		String aftersearch = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).getAttribute("value");
		Thread.sleep(2000);
		String box = driver.findElement(By.xpath("//div[@class=\"jOmXmb rhsg4\"]/span")).getText();
		System.out.println(aftersearch);
		System.out.println(box);
		Assert.assertEquals(aftersearch, box);
	}
}
