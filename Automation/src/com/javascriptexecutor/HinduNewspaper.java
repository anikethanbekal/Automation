package com.javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.tyss.ScreenShotMethod;

public class HinduNewspaper {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		//open the chrome browser
		WebDriver driver = new ChromeDriver(co);
		//maximize the browser
		driver.manage().window().maximize();
		//Creating object to take screenshot
		ScreenShotMethod s =new ScreenShotMethod();
		//enter the url
		driver.get("https://www.thehindu.com/todays-paper/");
		s.takeScreenShot(driver, "HinduNewpaper-Home");
		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		//To scroll complete down
		je.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		s.takeScreenShot(driver, "HinduNewpaper-ScrollDown");
		Thread.sleep(2000);
		je.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		s.takeScreenShot(driver, "HinduNewpaper-ScrollUp");
		Thread.sleep(2000);
		driver.close();
	} 
}
