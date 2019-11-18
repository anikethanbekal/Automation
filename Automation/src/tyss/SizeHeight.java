package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class SizeHeight {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver1= new Gecko
		driver.get("https://demo.actitime.com/login.do");
		int unHeight = driver.findElement(By.id("username")).getSize().getHeight();
		int psHeight = driver.findElement(By.name("pwd")).getSize().getHeight();
		if (unHeight == psHeight)
		{
			System.out.println("Height of username and password is same");
		}
		else {
			System.out.println("Height of username and password doesnt match");
		}
		driver.close();
	}
}
