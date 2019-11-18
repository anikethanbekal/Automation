package com.assignment;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tyss.ScreenShotMethod;

public class Scenarionew6 {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	// open the Chrome browser
			WebDriver driver = new ChromeDriver();
			ScreenShotMethod s =new ScreenShotMethod();
			// maximize the browser
			driver.manage().window().maximize();
			// enter the url
			driver.get("https://www.bluestone.com/");
			Actions a =new Actions(driver);
			WebElement target= driver.findElement(By.xpath("//li[@class=\"menuparent repb\"]/a[@title=\"Rings\"]"));
			a.moveToElement(target).perform();
			driver.findElement(By.xpath("//ul[@class=\"two-col\"]/li/a[@title=\"Diamond Rings\"]")).click();
			WebElement target2 = driver.findElement(By.id("Price-form"));
			a.moveToElement(target2).perform();
			List<WebElement> submenu = driver.findElements(By.xpath("//div[@id=\"grid-view-result\"]/ul/li/div[1]/div/div/a/img/following::span[4]"));
			System.out.println("Price list by default: ");
		/*
		 * for (WebElement item : submenu) { al.add(item.getText()); }
		 */
			System.out.println("*************");
			WebElement target3= driver.findElement(By.xpath("//div[@class=\"pull-right sort-options\"]"));
			a.moveToElement(target3).perform();
			driver.findElement(By.xpath("//a[contains(.,\"Price Low to High \")]")).click();
			WebElement target4= driver.findElement(By.id("Price-form"));
			a.moveToElement(target4).perform();
			List<WebElement> submenu2 = driver.findElements(By.xpath("//span[@class=\"new-price\"]"));
			System.out.println("Price list after sort: ");
		/*
		 * for (WebElement item : submenu2) { //al1.add(item.getText());
		 * //System.out.println("+++++++"); }
		 */
			//System.out.println(al);
			System.out.println(submenu2);
			Assert.assertEquals(submenu	, submenu2);
		}
	}
