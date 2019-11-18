package com.tyss;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Command {
	@Test
	public void testA() throws MalformedURLException {
		String u = "http://192.168.43.221:4445/wd/hub";
		URL node = new URL(u);
		DesiredCapabilities browser = new DesiredCapabilities();
		browser.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(node, browser);
		driver.get("http://www.google.com");
	}
}