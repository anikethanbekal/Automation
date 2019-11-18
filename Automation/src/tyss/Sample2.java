package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Welcom to tyss");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title =driver.getTitle();
		System.out.println(title);
		driver.close();
		WebElement e;
		e.
	}

}
