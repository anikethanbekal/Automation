package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name ='email']")).sendKeys("ABC");
		driver.findElement(By.cssSelector("input[id ='pass']")).sendKeys("DEF");
		driver.findElement(By.cssSelector("input[id ='u_0_b']")).click();
	}
}
