package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin {
	@FindBy(id ="identifierId")
	private WebElement emailid;
	@FindBy(id = "identifierNext")
	private WebElement next;
	@FindBy(id = "passwordNext")
	private WebElement pnext;
	@FindBy(name ="password")
	private WebElement pass;

	public GmailLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterID(String text) {
		emailid.sendKeys(text);
	}
	public void clickNext(){
		next.click();
	}
	public void pclickNext(){
		pnext.click();
	}
	public void password(String text) {
		pass.sendKeys(text);
	}
}
