//write a script for custom wait. Its concept of inner class or anonymous class is used
package com.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url of the html created
		driver.navigate().to("file:///D:/Selenium/HTML%20Files/Sample03.html");
		//check for the textB is displayed or not (concept of anonymous classs
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			//here override the apply method(its abstract) present in ExpectedCondition interface
			public java.lang.Boolean apply(WebDriver driver) {
				return driver.findElement(By.name("textB")).isDisplayed();
			}
		});
		//If textB is displayed then pass a value to textbox A
		driver.findElement(By.name("textA")).sendKeys("Ani");
	}
}
