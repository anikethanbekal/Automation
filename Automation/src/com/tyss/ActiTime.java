package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//Sometimes implicitywait wont work so we use Thread.sleep
		//enter the Actitime url
		driver.navigate().to("https://demo.actitime.com/login.do");
		//Selecting username field and entering details
		driver.findElement(By.id("username")).sendKeys("admin");
		//Selecting password field and entering details
		driver.findElement(By.cssSelector("input[name = 'pwd']")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"popup_menu_button popup_menu_button_support\"]/div[@class=\"popup_menu_icon\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@onclick=\"MenuHandler.openAbout(); return false;\"]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//td[@class=\"aboutCopyright\"]")).getText();
		System.out.println(text);
	}
}
