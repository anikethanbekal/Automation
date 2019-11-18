//Closing the child browser
package com.popups;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class ClosingChildBrowser {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		wins.remove(parent);
		for (String win : wins) {
			driver.switchTo().window(win).close();
		}
	}
}
	