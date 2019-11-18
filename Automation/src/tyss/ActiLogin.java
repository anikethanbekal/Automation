package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLogin {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().
		driver("http://laptop-u97jc2rm/login.do");
		driver.findElement(By.cssSelector("input[name ='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() ='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() ='Logout']")).click();
		Thread.sleep(2000);
		driver.close();
	
	}

}
