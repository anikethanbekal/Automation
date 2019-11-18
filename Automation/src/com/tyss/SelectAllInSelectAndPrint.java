// write a script for selecting multiple option values 
//here we have created a html file known as sample2.html
package com.tyss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectAllInSelectAndPrint {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// opening the browser
		WebDriver driver = new ChromeDriver();
		// Maximizing the browser
		driver.manage().window().maximize();
		// typing the url
		driver.get("file:///D:/Selenium/HTML%20Files/sample2.html");
		WebElement element = driver.findElement(By.id("b"));
		Select s = new Select(element);
		List<WebElement> num = s.getOptions();
		if (s.isMultiple()) {
			for (WebElement nums : num) {
				System.out.println(nums.toString());
				//s.selectByValue(nums.getText());
				// System.out.println(s.getAllSelectedOptions());// if we print this then we
				// will get adress not the selected option coz toString is not overridden
			}
		}
		// to print all selected options by getText here toString overridden
		List<WebElement> opt = s.getAllSelectedOptions();
		for (WebElement opts : opt) {
			System.out.println(opts.getText());
		}
		System.out.println(s.getFirstSelectedOption().getText());
		s.deselectAll();
	}
}
