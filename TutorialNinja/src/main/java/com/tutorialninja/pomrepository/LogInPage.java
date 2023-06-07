package com.tutorialninja.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailfield;
	@FindBy(id = "input-password")
	private WebElement passwordfield;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginbtn;

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement EditYourAccountLinkText;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEditYourAccountLinkText() {
		return EditYourAccountLinkText;
	}

	@FindBy(xpath = "//div[contains(@class,'alert')]")
	WebElement warningmessage;

	public WebElement getWarningmessage() {
		return warningmessage;
	}

	@FindBy(xpath = "//div[@class='form-group']/child::a[text()='Forgotten Password']")
	WebElement forgottenpassword;

	public WebElement getForgottenpassword() {
		return forgottenpassword;
	}
	@FindBy(xpath = "//strong[text()='I am a returning customer']")
	WebElement loginpagedisplay;
	

	public WebElement getLoginpagedisplay() {
		return loginpagedisplay;
	}

	@FindBy(xpath = "//h1[text()='Forgot Your Password?']")
	WebElement forgottenpasswordpage;

	public WebElement getForgottenpasswordpage() {
		return forgottenpasswordpage;
	}
	
	@FindBy(xpath = "//div[@class='well']")
	WebElement loginpageverify;

	public WebElement getLoginpageverify() {
		return loginpageverify;
	}
	
	
	

}
