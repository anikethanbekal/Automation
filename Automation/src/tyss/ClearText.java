package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the browser
		WebDriver driver =new ChromeDriver();
		//enter the url
		driver.get("file:///C:/Users/bekal/Desktop/HTML%20Files/Sample.html");
		//clear the text or value present in textbox
		driver.findElement (By.xpath("//input='text' and @value='A']")).clear();
		//get the text of the link
		String value = driver.findElement(By.id("d1")).getText();
		System.out.println("Text of a link= "+value);
		//check whether buttton A is enabled or not
		if(driver.findElement(By.xpath("//input[@type='button' and @value ='A']")).isEnabled())
				{
					System.out.println("Button A is enabled");
				}
		//check whether button login is disabled or not
		if (driver.findElement(By.xpath("//input[@value ='Login']")).isDisplayed())
				{
					System.out.println("Button A is enabled");
				}
		//check whetehr C1 is selected or not
		if (driver.findElement(By.xpath("//input[@checked]")).isSelected()) {
			System.out.println("Checkbox is selected");
		}
				
		driver.close();
	}
}
