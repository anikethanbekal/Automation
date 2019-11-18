package com.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollVertical {
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
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(10000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,500)"); //at 0,500 (X,Y)
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-200)"); //at 0,300 (X,Y)
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,-300)"); //at 0,0 (X,Y)
		Thread.sleep(2000);
		//To scroll complete down
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	} 
}
