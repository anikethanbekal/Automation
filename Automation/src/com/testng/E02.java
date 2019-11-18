package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class E02 {
	@Test		//download from testng.annotations not from junit else you'll get internal error popup
	public void demoM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("Abcd");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("123456789",Keys.ENTER);
		driver.findElement(By.name("u_0_b")).click();
		driver.close();
		System.out.println("HI");
	}
}
