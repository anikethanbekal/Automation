package com.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//enter the Actitime url
		driver.navigate().to("https://demo.actitime.com/login.do");
		//Selecting username field and entering details
		driver.findElement(By.id("username")).sendKeys("admin");
		//Selecting password field and entering details
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		WebDriverWait ww =new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.titleContains("Enter"));
		driver.findElement(By.id("logoutLink")).click();
	}
}
