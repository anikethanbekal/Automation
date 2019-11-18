//script to switch tab i.e; to get control the next window
package com.tyss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import net.bytebuddy.asm.Advice.Enter;

public class SwitchTab {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		// to avoid thread.sleep
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//enter the flipkart url
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//enter iphone in search textbox and click enter
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Apple iPhone 7 (Black, 32 GB)']")).click();
		//To switch tab //while opening in chrome it may open in new  tab but control will be in previous tab
		Set<String> sabTab = driver.getWindowHandles();
	    for (String tab: sabTab)
	    {
	    	driver.switchTo().window(tab);
	    }
	    //click on add to cart
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	}   
}