//here if use directly go back and clear we get staleElementException (we get this exception because the reference or xpath you took is old(only once can be used).
//so in order to avoid it we store in another class (SeleniumHome) and create object of it here.
package com.testpom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.SeleniumHome;

public class Selenium {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		//opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximizing the browser
		driver.manage().window().maximize();
		//typing the url
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(2000); 
		SeleniumHome sh = new SeleniumHome(driver);
		sh.sendText("java");
		sh.goclick();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		sh.clearText();
		Thread.sleep(2000);
		sh.sendText("testNG");
		Thread.sleep(2000);
		sh.goclick();
	}
		
}
