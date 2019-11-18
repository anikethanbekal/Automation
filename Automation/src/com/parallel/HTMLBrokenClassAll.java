package com.parallel;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HTMLBrokenClassAll {
	@Test
	public void brokenLink() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		// Opening the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// enter the url
		driver.get("file:///D:/Selenium/HTML%20Files/BrokenLinks.html");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for (WebElement li : link) {
			String link1 = li.getAttribute("href");
			URL u = new URL(link1);
			HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
			int rcode = con.getResponseCode();
			if (rcode == 200) {
				System.out.println(rcode);
				System.out.println("Link is not broken");
				System.out.println(con.getResponseCode());
			} else {
				System.out.println(rcode);
				System.out.println("Link is broken");
				System.out.println(con.getResponseCode());
			}
		}
	}
}
