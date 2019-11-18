package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {
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
		//closing the login in page popup
		driver.findElement(By.xpath("//a[@ class ='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		//typing sofa and enter automatically
		driver.findElement(By.xpath("//input [@ placeholder=\"Search\"]")).sendKeys("sofa",Keys.ENTER);	// we are passing sofa in search bar and pressing enter with the help of keys enum
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title=\"Walton Leatherette Sofa (Chocolate)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='button full']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"large-4 columns btn_wrap\"]/button[@type=\"submit\"]")).click();
	}
}
