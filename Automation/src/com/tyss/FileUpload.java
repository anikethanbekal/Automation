//write a script to upload a file (Any file to convert it to .exe)
package com.tyss;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		//Thread.sleep(5000);
		driver.findElement(By.id("file_wraper0")).click();
		Thread.sleep(2000);
		//convert the file(.txt, .doc, ....) into .exe with the help of autoIt window and SciTE script editor
		Runtime r = Runtime.getRuntime();
		r.exec("D:\\Selenium\\FileUploadDemo2\\FileUploadDemo2.exe");
	}
}
