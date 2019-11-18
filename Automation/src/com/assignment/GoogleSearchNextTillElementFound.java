package com.assignment;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchNextTillElementFound {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("One Plus",Keys.ENTER);
		driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
		WebElement ele = driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]"));
		JavascriptExecutor je = (JavascriptExecutor)driver;
		List<WebElement> pages = driver.findElements(By.xpath("//td"));
		
		Thread.sleep(2000);
		for (int i = 1; i< pages.size()-1;i++) {
			
			if(path.isDisplayed()) {
				path.click();
				break;
			}
			je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@style=\"display:block;margin-left:53px\"]")).click();
			Thread.sleep(2000);
		}
	} 
}
