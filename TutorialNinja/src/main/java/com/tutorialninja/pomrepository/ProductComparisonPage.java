package com.tutorialninja.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductComparisonPage {
	WebDriver driver;

	public ProductComparisonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='button']")
	WebElement addtocartbutton;
	@FindBy(xpath = "//a[text()='product comparison']")
	WebElement productcomparisonlink;
	
	
	
	public WebElement getProductcomparisonlink() {
		return productcomparisonlink;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	
}
