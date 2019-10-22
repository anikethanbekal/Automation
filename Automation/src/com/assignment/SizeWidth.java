package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeWidth {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//get the width of the username textbox
		int unWidth = driver.findElement(By.id("username")).getSize().getWidth();
		//get the width of the password textbox
		int pwWidth = driver.findElement(By.name("pwd")).getSize().getWidth();
		//compare both the width of username and password
		if (unWidth == pwWidth)
		{
			System.out.println("Width of username and password is same");
		}
		else {
			System.out.println("Width of username and password doesnt match");
		}
		driver.close();
	}

}
