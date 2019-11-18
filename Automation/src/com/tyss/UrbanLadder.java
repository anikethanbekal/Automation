package com.tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UrbanLadder {
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		//opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximizing the browser
		driver.manage().window().maximize();
		//typing the url
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(15000); 
		//closing the login in page popup
		driver.findElement(By.xpath("//a[@ class ='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//a[@href=\"../../furniture-stores?src=header\"]")).click();
		List<WebElement> store = driver.findElements(By.xpath("//a[@class=\"_1-vgs\"]"));
		for (WebElement s : store) {
			System.out.println(s.getText());
		}
	}
}