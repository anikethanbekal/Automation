package com.tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanMenus {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//opening the browser
		WebDriver driver = new ChromeDriver();
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
			String menuName =name.getText();
			Thread.sleep(10000);
			System.err.println(menuName);
			a.moveToElement(name).build().perform();
			Thread.sleep(10000);
			List<WebElement> submenu = driver.findElements(By.xpath("//span[contains(.,'"+menuName+"')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
			for (WebElement item : submenu) {
				System.out.println(item.getText());
			}	
		}
		driver.close();
	}
}