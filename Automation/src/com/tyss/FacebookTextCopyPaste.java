//script to copy and paste the textbox name into the textbox
package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTextCopyPaste {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Instead of Thread.sleep we can use this for wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the url
		driver.get("https://facebook.com");
		//copy the text from the facebook first text box here its EmailorPhone
		String text = driver.findElement(By.xpath("//label[@for='email']")).getText();
		//paste the copied text into the first textbox
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(text);
	}
}