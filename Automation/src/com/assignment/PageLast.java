package com.assignment;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class PageLast {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Creating object to take screenshot
		//enter the url
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Java",Keys.ENTER);
		//type casting to JavascriptExecutor 
		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]"));
		List<WebElement> pages = driver.findElements(By.xpath("//td"));
		Thread.sleep(2000);
		for (int i = 1; i< pages.size()-1;i++) {
			je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			System.out.println(i);
			driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
			Thread.sleep(2000);
		
			}
	} 
}
