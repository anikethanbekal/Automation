package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookCreateAccount {
	@Test
	public void createAccount() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		// Opening the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the url
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		// enter first name
		driver.findElement(By.name("firstname")).sendKeys("Anikethan");
		//enter surname name
		 driver.findElement(By.name("lastname")).sendKeys("B");
		//enter email-id/password
		 driver.findElement(By.name("reg_email__")).sendKeys("anikethanb2019@gmail.com");
		 Thread.sleep(2000);
		 //re-enter password
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("anikethanb2019@gmail.com");
		//enter new password
		 driver.findElement(By.name("reg_passwd__")).sendKeys("testyantra");
		//select day(11)
		 driver.findElement(By.xpath("//select[@id=\"day\"]/option[@value=\"11\"]")).click();
		 //select month(Jan)
		 driver.findElement(By.xpath("//select[@id=\"month\"]/option[@value=\"1\"]")).click();
		 //select year(1993)
		 driver.findElement(By.xpath("//select[@id=\"year\"]/option[@value=\"1993\"]")).click();
		 //select sex (Male)
		 driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		 //click on sign up
		 driver.findElement(By.name("websubmit")).click();
	}
}
