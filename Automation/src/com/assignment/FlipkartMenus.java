package com.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMenus {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// Opening the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// enter the flipkart url
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='_114Zhd']"));
		Actions a = new Actions(driver);
		// printing all the list using for each loop
		for (WebElement name : menu) {
			String menuName = name.getText();
			Thread.sleep(10000);
			System.err.println(menuName);
			a.moveToElement(name).build().perform();
			Thread.sleep(10000);
			List<WebElement> submenu = driver.findElements(By.xpath(
					"//span[contains(.,'"+menuName+"')]/ancestor::div[@class='_3zdbog _3Ed3Ub']/descendant::ul/li"));
			for (WebElement item : submenu) {
				System.out.println(item.getText());
			}
		}
	}
}
