//script to fetch the text from a website and printing it
package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
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
		//pause for 5sec
		Thread.sleep(5000); 
		//fetching the sale text from url and storing in a variable text
		String text = driver.findElement(By.xpath("//li[@class=\"topnav_item saleunit\"]/span[@class=\"topnav_itemname\"]")).getText();
		//printing the fetched text
		System.out.println(text);
		//closing the browser
		driver.close();
	}
}
