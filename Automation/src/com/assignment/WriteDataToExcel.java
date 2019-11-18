package com.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WriteDataToExcel {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	}
	public static void writeData(String sheet, int row, int col, String data)
			throws IOException, EncryptedDocumentException, InvalidFormatException {
	try {
		File f = new File("‪D:\\Education\\New2.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		System.out.println(f.getAbsoluteFile());
		wb.getSheet(sheet).createRow(row).createCell(col).setCellValue(data);
		FileOutputStream fio = new FileOutputStream("‪D:\\Education\\New2.xlsx");

		wb.write(fio);
		wb.close();
	} catch (Exception e) {
		System.out.println("FileNotFound");
		e.printStackTrace();
	}
		

	}

	public static void main(String[] args)
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");// load the url
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		Thread.sleep(2000);

		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
		Actions a = new Actions(driver);

		int row = 0;

		for (WebElement name : menu) {
			String menuName = name.getText();
			System.err.println(menuName);
			a.moveToElement(name).build().perform();
			Thread.sleep(1000);

			List<WebElement> subMenu = driver.findElements(By
					.xpath("//span[contains(.,'" + menuName + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			writeData("Sheet1", row, 0, name.getText());
			row++;

			for (WebElement item : subMenu) {
				System.out.println(item.getText());
				int col;
				writeData("Sheet1", row, 0, item.getText());
				row++;
			}

		}
	}
}