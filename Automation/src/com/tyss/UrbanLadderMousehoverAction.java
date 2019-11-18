package com.tyss;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadderMousehoverAction {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		//opening the browser
		WebDriver driver = new ChromeDriver();
		ScreenShotMethod s =new ScreenShotMethod();
		//Maximizing the browser
		driver.manage().window().maximize();
		//typing the url
		driver.get("https://www.urbanladder.com/?gclid=EAIaIQobChMI7t6E8viT5QIVyA0rCh1zyg1vEAAYASAAEgLEhvD_BwE");
		Thread.sleep(15000); 
		//closing the login in page popup
		driver.findElement(By.xpath("//a[@ class ='close-reveal-modal hide-mobile']")).click();
		//get all the menu list and storing in the variable
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
		Actions a = new Actions(driver);
		//printing all the list using for each loop
		for (WebElement name : menu) {
			 String text = name.getText();
			s.takeScreenShot(driver,text);
			Thread.sleep(2000);
			a.moveToElement(name).build().perform();
			Thread.sleep(2000);
			;
		}
	}
}