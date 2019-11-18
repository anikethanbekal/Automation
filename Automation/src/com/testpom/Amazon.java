package com.testpom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.AmazonSearch;
import com.pom.SeleniumHome;

public class Amazon {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		//opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximizing the browser
		driver.manage().window().maximize();
		//typing the url
		driver.get("https://www.amazon.in");
		Thread.sleep(2000); 
		AmazonSearch as = new AmazonSearch(driver);
		as.sendText("iphone");
		Thread.sleep(2000);
		as.goclick();
		Thread.sleep(2000);
		as.iphoneClick();
		Thread.sleep(2000);
		as.addtocard();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		as.clearText();
		Thread.sleep(2000);
		as.sendText("oneplus");
		as.goclick();
		Thread.sleep(2000);
		as.oneplusClick();
	}
}
