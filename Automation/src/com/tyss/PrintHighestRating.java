package com.tyss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHighestRating {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		double i =0;
		double big=0;
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		// to avoid thread.sleep
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//enter the flipkart url
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//enter java books in search textbox and click enter
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("java books",Keys.ENTER);
		//click sort price low to high
		driver.findElement(By.xpath("//div[@class=\"_1xHtJz\"][2]")).click();
		List<WebElement> rating = driver.findElements(By.xpath("//div[@class=\"hGSR34\"]"));
		for (WebElement rates : rating) {
			String rate =rates.getText();
			System.out.println(rate);
			i =Double.parseDouble(rate);
			if (big<i)
				big=i;
		}
		System.out.println("Higest Rating"+big);
	}
}
