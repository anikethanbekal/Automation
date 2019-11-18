package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Sleeper;

public class CalendarPicker {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		//Opening the browser
		WebDriver driver = new ChromeDriver(co);
		//Maximize the browser
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Bengaluru");
		driver.findElement(By.id("dest")).sendKeys("Mangalore");
		WebElement date = driver.findElement(By.xpath("//label[@class=\"db text-trans-uc\"]"));
		date.click();
		String s2= "Dec 2019";
		Thread.sleep(2000);
		//selectByJs(driver, date, dateval);
		driver.findElement(By.xpath("//div[@class=\"rb-calendar hide\"]/table/tbody/tr[@class=\"rb-monthHeader\"]/td[@class=\"monthTitle\"]")).getText();
		
		System.out.println(s1);
		/*
		 * while (s1 != s2) {
		 * 
		 * }
		 */	}
		
}//div[@class="rb-calendar hide"]/descendant::td[@class="monthTitle"].gettext()
