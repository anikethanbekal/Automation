package com.tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleMap {
	@Test
	public void mapSearch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Google Maps", Keys.ENTER);
		driver.findElement(By.xpath("//a[@href=\"https://maps.google.com/\"]/h3[@class=\"LC20lb\"]")).click();
		driver.findElement(By.id("mylocation")).click();
		driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).sendKeys("BTM", Keys.ENTER);
		driver.findElement(By.xpath("//div[@data-value=\"Directions\"]")).click();
	}
}
