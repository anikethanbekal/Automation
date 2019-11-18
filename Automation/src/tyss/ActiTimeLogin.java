package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://laptop-u97jc2rm/login.do");
		driver.findElement(By.cssSelector("input[name ='username']")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		String ExpectedTitle ="Enter Time-Track";
		String ActualTitle =driver.getTitle();
		if (ActualTitle.contains(ExpectedTitle)) {
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Title is displayed");
		}
		else 
		{
			System.out.println("Tile is not matching");
		}
		driver.close();
		
	}

}
