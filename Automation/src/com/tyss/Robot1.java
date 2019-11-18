package com.tyss;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.actitime.com/");
	WebElement lb = driver.findElement(By.id("loginButton"));
	Actions a = new Actions(driver);
	a.contextClick(lb).build().perform();
	Actions action = new Actions(driver);
	action.contextClick().build().perform();
	java.awt.Robot robot = new java.awt.Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
