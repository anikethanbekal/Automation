// Closing the multiple browser in reverse order
package com.popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingBrowserInReverse {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Set<String> wins = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList(wins);					// since set list is not indexed we convert that into the arraylist to reverse
		for (int i = al.size()-1; i >= 0 ; i--) 					//for loop to start from last
		{					
			driver.switchTo().window(al.get(i)).close();
			Thread.sleep(2000);
		}
	
	}
}
