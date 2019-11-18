package com.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		//Opening the browser
		WebDriver driver = new ChromeDriver(co);
		//Maximize the browser
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
	}
}
