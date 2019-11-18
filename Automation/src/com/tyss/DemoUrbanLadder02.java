//script to get all the menu lists in urban ladder
package com.tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUrbanLadder02 {
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
		Thread.sleep(2000); 
		//get all the menu list and storing in the variable
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]"));
		//printing all the list using for each loop
		for (WebElement name : menu) {
			System.out.println(name.getText());
		}
	}
}