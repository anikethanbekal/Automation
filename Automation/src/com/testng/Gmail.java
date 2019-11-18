package com.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import bsh.Remote;

public class Gmail {
	@Test
	public void gmail() throws InterruptedException {
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
				Thread.sleep(5000);
		/*
		 * WebElement one = driver.findElement(By.xpath(
		 * "//table[@id=':2z']/tbody/tr/td[@id=':36']/descendant::span[@id=':38']"));
		 * System.out.println(one.getText());
		 */
		
			List<WebElement> inbox = driver.findElements(By.
		 xpath("//tbody/tr[@class=\"zA zE x7\"]/td/div/div/div/div/span/span[@class=\"bqe\"]"));
			for (WebElement thing : inbox) { Reporter.log(thing.getText());
			Thread.sleep(2000); Reporter.log("++++"); 
			}
		 	}
}
