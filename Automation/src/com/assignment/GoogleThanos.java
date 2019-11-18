package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleThanos {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the Chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.google.com/");
		//pause for 2sec
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Thanos",Keys.ENTER);
		String pretext = driver.findElement(By.xpath("//div[@id=\"resultStats\"]")).getText();
		System.out.println(pretext);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class=\"Z4Kand MyFLjb\"]")).click();
		Thread.sleep(30000);
		String posttext = driver.findElement(By.xpath("//div[@id=\"resultStats\"]")).getText();
		System.out.println(posttext);
	}
}