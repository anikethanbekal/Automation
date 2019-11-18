//write a script to close all the parent and child browser except the title of the browser AMAZON
package tyss;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample02 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Set<String> wins = driver.getWindowHandles();
		for (String win : wins) {
			if (win.equalsIgnoreCase("Amazon")) {
				continue;
			}
			else {
			driver.switchTo().window(win).close();

			}
		}
	}
}
