package tyss;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample03 {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("BBC" + Keys.ENTER);
		java.util.List<WebElement> my_list = driver.findElements(By.xpath("//div[@id='rso']//div[@class='rc']/h3[@class='r']/a"));
		for (WebElement item:my_list)
		{
		    if(item.getAttribute("innerHTML").contains("BBC - Home"))
		    item.click();
		}
	}
}
