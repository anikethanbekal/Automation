package com.parallel;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HTMLBrokenLink {
	@Test
	public void brokenLink() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		// Opening the browser
				WebDriver driver = new ChromeDriver();
				// Maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//enter the url
				driver.navigate().to("file:///D:/Selenium/HTML%20Files/BrokenLinks.html");
				WebElement link = driver.findElement(By.xpath("//a[contains(.,'Urban')]"));
				String link1 = link.getAttribute("href");
				URL u = new URL(link1);
				HttpsURLConnection con =(HttpsURLConnection) u.openConnection();
				int rcode =con.getResponseCode();
				if(rcode ==200) {
					System.out.println(rcode);
					System.out.println("Link is not broken");
					System.out.println(con.getResponseCode());
				}
				else
				{
					System.out.println(rcode);
					System.out.println("Link is broken");
					System.out.println(con.getResponseCode());
				}
				
				
	}
}
