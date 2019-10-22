package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeHeightAndWidth {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Dimension Unsize = driver.findElement(By.id("username")).getSize();
		int Unheight = Unsize.getHeight();
		int UnWidth = Unsize.getWidth();
	}
}
