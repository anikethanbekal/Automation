//write a script to open facebook
package com.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookExplicit {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name ='email']")).sendKeys("alia");
		WebDriverWait ww =new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.id("email"), "alia"));
		driver.findElement(By.id("pass")).sendKeys("manager",Keys.ENTER);
	}
}
