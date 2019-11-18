package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearch {
	@FindBy(id ="twotabsearchtextbox")
	private WebElement search;
	@FindBy(xpath = "//input[@value=\"Go\"]")
	private WebElement go;
	@FindBy(id ="pdagDesktopSparkleDescription1")
	private WebElement iPhone;
	@FindBy(xpath ="//img[@alt=\"OnePlus 7 (Mirror Grey, 6GB RAM, Optic AMOLED Display, 128GB Storage, 3700mAH Battery)\"]")
	private WebElement oneplus;
	@FindBy(id ="submit.add-to-cart")
	private WebElement addtocart;
	
	public AmazonSearch(WebDriver driver)
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
	public void iphoneClick(){
		iPhone.click();
	}
	public void oneplusClick(){
		oneplus.click();
	}
	public void addtocard(){
		addtocart.click();
	}
	
}
