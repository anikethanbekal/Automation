package tyss;

import org.openqa.selenium.WebDriver;

public class DemoD {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	static void test(WebDriver driver) throws InterruptedException{
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		driver.get("https://www.google.com/");
	}

}
