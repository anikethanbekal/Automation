//we use this to store a particular webelement in order to avoid staleElementException
package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHome {
	@FindBy(id ="q")
	private WebElement search;
	@FindBy(id ="submit")
	private WebElement go;
	public SeleniumHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendText(String text) {
		search.sendKeys(text);
	}
	public void goclick(){
		go.click();
	}
	public void clearText() {
		search.clear();
	}
	
}
