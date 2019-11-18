package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSelectingSuggestion {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.google.com/");
		//pause for 2sec
		Thread.sleep(2000);
		//type the java word in search bar and enter automatically using Keys enum.
		driver.findElement(By.xpath("//input [@ class='gLFyf gsfi']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		driver.findElement(By.xpath("//li[@class=\"sbct\"][4]")).click();
	}
}
