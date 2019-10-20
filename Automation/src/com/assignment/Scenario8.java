package com.assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.tyss.ScreenShotMethod;

public class Scenario8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the Chrome browser
		WebDriver driver = new ChromeDriver();
		//create object of a class to take screenshot
		ScreenShotMethod s = new ScreenShotMethod();
		s.takeScreenShot(driver, "Bluestone Scenario8-01");
		// maximize the browser
		driver.manage().window().maximize();
		s.takeScreenShot(driver, "Bluestone Scenario8-02");
		// enter the url
		driver.get("https://www.bluestone.com/");
		s.takeScreenShot(driver, "Bluestone Scenario8-03");
		Actions a =new Actions(driver);
		s.takeScreenShot(driver, "Bluestone Scenario8-04");
		WebElement target= driver.findElement(By.xpath("//a[@title=\"Jewellery\"]"));
		a.moveToElement(target).perform();
		s.takeScreenShot(driver, "Bluestone Scenario8-05");
		driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();
		s.takeScreenShot(driver, "Bluestone Scenario8-06");
		driver.findElement(By.xpath("//img[@alt=\"The Arjun Kada For Him\"]")).click();
		s.takeScreenShot(driver, "Bluestone Scenario8-07");
		driver.findElement(By.xpath("//span[@class=\"size-box-overlay\"]")).click();
		s.takeScreenShot(driver, "Bluestone Scenario8-08");
		driver.findElement(By.xpath("//li[@data-key=\"02\"]")).click();
		s.takeScreenShot(driver, "Bluestone Scenario8-09");
		String before = driver.findElement(By.name("chainselect")).getText();
		System.out.println("Selected Size: "+before);
		driver.findElement(By.id("buy-now")).click();
		s.takeScreenShot(driver, "Bluestone Scenario8-10");
		String after = driver.findElement(By.xpath("//span[@class=\"size-box-overlay\"]")).getText();
		System.out.println("Size Displayed in Cart: "+after);
		driver.close();
	}
}