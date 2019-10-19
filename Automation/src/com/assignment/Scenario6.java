package com.assignment;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.tyss.ScreenShotMethod;

public class Scenario6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// open the Chrome browser
		WebDriver driver = new ChromeDriver();
		ScreenShotMethod s =new ScreenShotMethod();
		// maximize the browser
		driver.manage().window().maximize();
		// enter the url
		driver.get("https://www.bluestone.com/");
		s.takeScreenShot(driver, "BlueStone01");
		Actions a =new Actions(driver);
		WebElement target= driver.findElement(By.xpath("//li[@class=\"menuparent repb\"]/a[@title=\"Rings\"]"));
		a.moveToElement(target).perform();
		s.takeScreenShot(driver, "BlueStone02");
		driver.findElement(By.xpath("//ul[@class=\"two-col\"]/li/a[@title=\"Diamond Rings\"]")).click();
		s.takeScreenShot(driver, "BlueStone03");
		WebElement target2 = driver.findElement(By.id("Price-form"));
		a.moveToElement(target2).perform();
		s.takeScreenShot(driver, "BlueStone04");
		List<WebElement> submenu = driver.findElements(By.xpath("//span[@data-tagcategory=\"Price\"]"));
		System.out.println("Price list by default: ");
		for (WebElement item : submenu) {
			System.out.println(item.getText());
		}
		System.out.println("*************");
		WebElement target3= driver.findElement(By.xpath("//div[@class=\"pull-right sort-options\"]"));
		a.moveToElement(target3).perform();
		s.takeScreenShot(driver, "BlueStone05");
		driver.findElement(By.xpath("//a[contains(.,\"Price Low to High \")]")).click();
		s.takeScreenShot(driver, "BlueStone06");
		WebElement target4= driver.findElement(By.id("Price-form"));
		a.moveToElement(target4).perform();
		s.takeScreenShot(driver, "BlueStone07");
		List<WebElement> submenu2 = driver.findElements(By.xpath("//span[@data-tagcategory=\"Price\"]"));
		System.out.println("Price list after sort: ");
		for (WebElement item : submenu2) {
			System.out.println(item.getText());
		}
	}
}
