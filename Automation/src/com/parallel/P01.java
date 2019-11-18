//you have to edit xml file also
package com.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P01 {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	@Test
	public void testParameterWithXML() {
		driver.navigate().to("https://www.google.com/");
		/*
		 * WebElement userName = driver.findElement(By.name("q"));
		 * userName.sendKeys("HI");
		 */
	}
	
}
