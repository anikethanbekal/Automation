package com.tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ebay {
	@Test
	public void appleWatch() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ebay.com/");
		driver.findElement(By.name("_nkw")).sendKeys("Apple Watch", Keys.ENTER);
		List<WebElement> watches = driver.findElements(By.xpath("//h3[@class=\"s-item__title\"]"));
		int count = 0;
		WebElement e;
		for (WebElement watch : watches) {
			System.out.println(watch.getText());
		}
		for (WebElement watch1 : watches) {
			if(count==10) {
				watch1.click();
			}
			count++;
		}
	}
}
