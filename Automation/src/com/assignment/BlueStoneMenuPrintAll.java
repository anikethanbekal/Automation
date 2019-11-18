package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneMenuPrintAll {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// open the Chrome browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter the url
		driver.get("https://www.bluestone.com/");
		// pause for 5sec
		Thread.sleep(5000);
		List<WebElement> menu = driver.findElements(By.xpath("//nav[@class=\"wh-navbar\"]/ul/li"));
		Actions a = new Actions(driver);
		// printing all the list using for each loop
		for (WebElement name : menu) {
			String menuName = name.getText();
			Thread.sleep(10000);
			System.err.println(menuName);
			a.moveToElement(name).build().perform();
			Thread.sleep(10000);
			List<WebElement> submenu = driver.findElements(
					By.xpath("//a[contains(.,'"+menuName +" ')]/parent::li/descendant::ul[@class=\"odd-even-bg\"]/li/descendant::li"));
			for (WebElement item : submenu) {
				System.out.println(item.getText());
			}
		}
	}
}