package com.javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tyss.ScreenShotMethod;

public class SendKeysUsingJavascriptExecutor {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		//to send keys using javascript
		je.executeScript("document.getElementById('email').value=('abc')");
	}
}