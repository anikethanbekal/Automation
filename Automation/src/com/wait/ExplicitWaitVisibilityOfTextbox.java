//write a script to load a custom create html textbox (VisibilityOfTextbox.html) and wait till 
//the text box is loaded and enter the text into the box (manager)
package com.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitVisibilityOfTextbox {
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
		driver.navigate().to("file:///D:/Selenium/HTML%20Files/VisibilityOfTextbox.html");
		//create a object of webDriverWait class to give
		WebDriverWait ww =new WebDriverWait(driver, 10);
		//wait till the box is loaded
		ww.until(ExpectedConditions.visibilityOfElementLocated(By.id("iamtextbox")));
		//enter the text to be passed into the box
		driver.findElement(By.id("iamtextbox")).sendKeys("manager");
	}
}
