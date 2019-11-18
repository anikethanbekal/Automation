//script for google search java and click on the website and get the title of previous and vefore.
package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGoogleSearchjava {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the Chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.google.com/");
		//pause for 2sec
		Thread.sleep(2000);
		//type the java word in search bar and enter automatically using Keys enum.
		driver.findElement(By.xpath("//input [@ class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		//get the title of the current webpage
		System.out.println(driver.getTitle());
		//clicking on the java website dispalyed first
		driver.findElement(By.xpath("//a[@href=\"https://www.java.com/\"]/h3[@class=\"LC20lb\"]")).click();
		//get the title of the current webpage
		System.out.println(driver.getTitle());
		//close the browser
		driver.close();
	}
}
