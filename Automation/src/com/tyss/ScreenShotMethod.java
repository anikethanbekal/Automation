package com.tyss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShotMethod {
	public void takeScreenShot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot/"+name+".png");
		Files.copy(sc, ff);
		
	}
}
