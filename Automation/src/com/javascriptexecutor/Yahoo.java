package com.javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tyss.ScreenShotMethod;

public class Yahoo {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
			//open the chrome browser
			WebDriver driver =new ChromeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//Creating object to take screenshot
			ScreenShotMethod s =new ScreenShotMethod();
			//enter the url
			driver.get("https://in.yahoo.com/?p=us");
			s.takeScreenShot(driver, "Yahoo-Home");
			Thread.sleep(2000);
			JavascriptExecutor je = (JavascriptExecutor)driver;
			//To scroll complete down
			je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			s.takeScreenShot(driver, "Yahoo-ScrollDown");
			Thread.sleep(2000);
			je.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
			s.takeScreenShot(driver, "Yahoo-ScrollUp");
			Thread.sleep(2000);
			driver.close();
		}
}

