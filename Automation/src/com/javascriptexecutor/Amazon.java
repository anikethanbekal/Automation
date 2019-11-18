package com.javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
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
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//type casting to JavascriptExecutor 
		JavascriptExecutor je = (JavascriptExecutor)driver;
		//take the xpath of the element till which it should go [Note: the element selected will not be displayed after that bottom will be displayed]
		WebElement ele = driver.findElement(By.xpath("//span[@class=\"navFooterBackToTopText\"]"));
		Thread.sleep(2000);
		//scroll till the passed element
		je.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(2000);
		ele.click();
	} 
}
