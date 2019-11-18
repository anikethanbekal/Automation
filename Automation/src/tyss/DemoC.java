package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoC {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("welcom to tyss");
		WebDriver driver1= new ChromeDriver();
		DemoD.test(driver1);
		driver1.close();
		WebDriver driver2 =new FirefoxDriver();
		DemoD.test(driver2);
		driver2.close();
				
	}
}
