package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationX {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://laptop-u97jc2rm/login.do");
		//get the x axis of the usename textbox
		int unLocation =driver.findElement(By.name("username")).getLocation().getX();
		//get the x-axis of the password textbox
		int pwlocation =driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println(unLocation);
		System.out.println(pwlocation);
		driver.close();
	}
}
