//write a script to login, compose and send a mail in Gmail
package com.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GmailCompose {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// Opening the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the url
		driver.navigate().to("https://www.gmail.com/");
		//enter username
		driver.findElement(By.cssSelector("input[id ='identifierId']")).sendKeys("selenium.ty");
		//click next
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		//enter password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("seleniumtest");
		Thread.sleep(2000);
		//click on next
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		//click on compose button
		driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
		Thread.sleep(2000);
		//enter recipient address
		driver.findElement(By.xpath("//textarea[@name=\"to\"]")).sendKeys("abc");;
		Thread.sleep(2000);
		//enter the subject
		driver.findElement(By.xpath("//input[@name=\"subjectbox\"]")).sendKeys("HI");
		//enter the text body
		driver.findElement(By.xpath("//div[@class=\"Am Al editable LW-avf tS-tW\"]")).sendKeys("Welcome TO Gmail/n This is automated");
		Thread.sleep(2000);
		//click on send button
		driver.findElement(By.xpath("//div[@data-tooltip=\"Send ‪(Ctrl-Enter)‬\"]")).click();
	}
}
