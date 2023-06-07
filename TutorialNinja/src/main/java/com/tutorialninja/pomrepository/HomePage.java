
package com.tutorialninja.pomrepository;

import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='My Account']") WebElement myaccountdropdown;
	@FindBy(xpath = "//a[text()='Login']") WebElement login;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='Register']")
	WebElement Register;
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu dropdown')]/descendant::a[text()='Logout']")
	WebElement Logout;
	@FindBy(xpath = "//div[@id='content']/child::h1[text()='Account Logout']")
	WebElement LoggedOut;
	@FindBy(xpath = "//div[@class='list-group']/child::a[text()='Logout']")
	WebElement LogOutListOption;
	@FindBys({
		@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li")
		
	})
	List<WebElement> myacclist;
	

	
	public List<WebElement> getMyacclist() {
		return myacclist;
	}
	public WebElement getLogOutListOption() {
		return LogOutListOption;
	}
	public WebElement getLoggedOut() {
		return LoggedOut;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return Logout;
	}
	public WebElement getRegister() {
		return Register;
	}
	public WebElement getMyaccountdropdown() {
		return myaccountdropdown;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
