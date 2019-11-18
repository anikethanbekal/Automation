package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
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
		driver.get("https://www.bluestone.com/");
		//pause for 5sec
		Thread.sleep(5000);
		//type the rings word in search bar and enter automatically using Keys enum.
		driver.findElement(By.xpath("//input[@class=\"form-text typeahead\"]")).sendKeys("rings",Keys.ENTER);
		//select the ring and click on it
		driver.findElement(By.xpath("//div/a[@id=\"pid_6426\"]")).click();
		//pause for 2sec
		Thread.sleep(2000);
		//clicking on to select ring size 
		driver.findElement(By.xpath("//span[@class=\"size-box-overlay\"]")).click();
		//pause for 5sec
		Thread.sleep(5000);
		//selecting size =20
		driver.findElement(By.xpath("//li[@data-key=\"20\"]/span[@class=\"deliverBy\"]")).click();
		//click on the buy now button 
		driver.findElement(By.xpath("//div[@class='buynow-block col-xs-7']/input[@type='submit']")).click();
	}
}
