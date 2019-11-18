package tyss;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hi!!!!! Welcome to TYSS");
		System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("www.google.com");
	}

}