package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/bekal/Desktop/G.html");
		//using tag name locator 
		/*
		 * WebElement link = driver.findElement(By.tagName("a")); //click on the link
		 * link.click(); driver.navigate().back(); driver.navigate().forward(); //use
		 * the locator ID for click driver.findElement(By.id("d1")).click();
		 * driver.navigate().back(); //use the locator name for click
		 * driver.findElement(By.name("n1")).click(); driver.navigate().back(); //use
		 * the locator class for click driver.findElement(By.className("c1")).click();
		 * driver.close();
		 */
		//use the locator linktext for click 
		//driver.findElement(By.linkText("QSpider")).click();
		//use the locator partial partial linktext for click
		//driver.findElement(By.partialLinkText("QSpi")).click();
		driver.findElement(By.partialLinkText("der")).click();

		driver.close();
	}

}
