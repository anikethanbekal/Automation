package com.tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		//Opening the browser
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement before = driver.findElement(By.id("droppable"));
		System.out.println("Before Dragging: "+before.getText());
		Actions a =new Actions(driver);
		WebElement target = driver.findElement(By.id("draggable"));
		a.dragAndDropBy(target, 180, 30).doubleClick(target).perform();
		System.out.println("After Drag and Drop: "+driver.findElement(By.id("droppable")).getText());
	}
}
	
