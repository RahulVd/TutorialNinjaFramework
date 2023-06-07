package com.tutorialninja.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage  {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-firstname")
	WebElement firstnamefield;
	@FindBy(id="input-lastname")
	WebElement lastnamefield;
	@FindBy(id="input-email")
	WebElement emailfield;
	@FindBy(id="input-telephone")
	WebElement telephonefield;
	@FindBy(id="input-password")
	WebElement passwordfield;
	@FindBy(id="input-confirm")
	WebElement passwordconfirmfield;
	@FindBy(xpath = "//label[text()='Yes']")
	WebElement SubscribeYesRadio;
	@FindBy(xpath = "//label[text()='No']")
	WebElement SubscribeNoRadio;
	@FindBy(name = "agree")
	WebElement PrivacyCheckbox;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continuebutton;
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement registrationsuccess;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement existingemailwarning;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement privacywarning;
	@FindBy(className = "text-danger")
	WebElement passwordwarning;
	@FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
	WebElement passwordconfirmwarning;
	
	

	
	public WebElement getPasswordconfirmwarning() {
		return passwordconfirmwarning;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getPasswordwarning() {
		return passwordwarning;
	}
	public WebElement getPrivacywarning() {
		return privacywarning;
	}
	public WebElement getExistingemailwarning() {
		return existingemailwarning;
	}
	public WebElement getRegistrationsuccess() {
		return registrationsuccess;
	}
	public WebElement getFirstnamefield() {
		return firstnamefield;
	}
	public WebElement getLastnamefield() {
		return lastnamefield;
	}
	public WebElement getEmailfield() {
		return emailfield;
	}
	public WebElement getTelephonefield() {
		return telephonefield;
	}
	public WebElement getPasswordfield() {
		return passwordfield;
	}
	public WebElement getPasswordconfirmfield() {
		return passwordconfirmfield;
	}
	public WebElement getSubscribeYesRadio() {
		return SubscribeYesRadio;
	}
	public WebElement getSubscribeNoRadio() {
		return SubscribeNoRadio;
	}
	public WebElement getPrivacyCheckbox() {
		return PrivacyCheckbox;
	}
	public WebElement getContinuebutton() {
		return Continuebutton;
	}
	
	
	

}
