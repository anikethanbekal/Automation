//Write a script to enter the details(username and pass) in facebook once the login is displayed with the help of custom wait
package com.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWaitFacebookLogin {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Enter the url
		driver.get("https://facebook.com");
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			//here override the apply method(its abstract) present in ExpectedCondition interface
			public java.lang.Boolean apply(WebDriver driver) {
				return driver.findElement(By.id("u_0_b")).isDisplayed();
			}
		});
		driver.findElement(By.id("email")).sendKeys("ABC");
		driver.findElement(By.id("pass")).sendKeys("ABC",Keys.ENTER);
	}
}
