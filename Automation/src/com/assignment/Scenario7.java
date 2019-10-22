package com.assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.tyss.ScreenShotMethod;

public class Scenario7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the Chrome browser
		WebDriver driver = new ChromeDriver();
		//create object of a class to take screenshot
		ScreenShotMethod s = new ScreenShotMethod();
		s.takeScreenShot(driver, "Bluestone Scenario7-1");
		// maximize the browser
		driver.manage().window().maximize();
		s.takeScreenShot(driver, "Bluestone Scenario7-2");
		// enter the url
		driver.get("https://www.bluestone.com/");
		s.takeScreenShot(driver, "Bluestone Scenario7-3");
		Actions a =new Actions(driver);
		s.takeScreenShot(driver, "Bluestone Scenario7-4");
		WebElement target= driver.findElement(By.xpath("//a[@title=\"Jewellery\"]"));
		a.moveToElement(target).perform();
		s.takeScreenShot(driver, "Bluestone Scenario7-5");
		driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();
		s.takeScreenShot(driver, "Bluestone Scenario7-6");
		driver.findElement(By.xpath("//img[@alt=\"The Arjun Kada For Him\"]")).click();
		s.takeScreenShot(driver, "Bluestone Scenario7-7");
		driver.findElement(By.id("buy-now")).click();
		s.takeScreenShot(driver, "Bluestone Scenario7-8");
		String error = driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]")).getText();
		System.out.println("Error Message is : "+error);
		driver.close();
	}
}
