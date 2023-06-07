package com.tutorialninja.pomrepository;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='iPhone']/ancestor::div[@class='caption']")
	WebElement iphone;
	@FindBy(name = "search")
	WebElement searchbox;
	@FindBy(xpath = "//button[@type='button']/parent::span[@class='input-group-btn']")
	WebElement searchbutton;
	@FindBy(xpath = "//p[contains(text(),'search criteria.')]")
	WebElement productnotfound;
	@FindBy(xpath = "//a[contains(text(),'MacBook')]")
	WebElement productsfound;
	@FindBy(id = "input-search")
	WebElement searchcriteria;
	@FindBy(id = "button-search")
	WebElement searchcriteriabutton;
	@FindBy(name = "category_id")
	WebElement categorydropdown;
	@FindBy(name = "sub_category")
	WebElement subcategorycheckbox;
	@FindBy(xpath ="//button[@data-original-title='Compare this Product']")
	WebElement comparebutton;
	@FindBy(id = "compare-total")
	WebElement productcomparelink;
	@FindBy(xpath="//div[@id='content']/child::h1[text()='Product Comparison']")
	WebElement productcomparepage;
	@FindBy(id="button-cart")
	WebElement addtocartbutton;
	@FindBy(xpath = "//a[text()='shopping cart']")
	WebElement shoppingcartlink;
	@FindBy(xpath = "//div[@class='button-group']/descendant::span[text()='Add to Cart']")
	WebElement addtocartsearchpage;
	@FindBy(xpath = "//button[@data-original-title='Compare this Product']")
	WebElement compareproductbutton;

	
	
	
	
	

	public WebElement getCompareproductbutton() {
		return compareproductbutton;
	}

	public WebElement getAddtocartsearchpage() {
		return addtocartsearchpage;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getProductcomparepage() {
		return productcomparepage;
	}

	public WebElement getComparebutton() {
		return comparebutton;
	}

	public WebElement getProductcomparelink() {
		return productcomparelink;
	}

	public WebElement getSubcategorycheckbox() {
		return subcategorycheckbox;
	}

	public WebElement getCategorydropdown() {
		return categorydropdown;
	}

	public WebElement getSearchcriteria() {
		return searchcriteria;
	}

	public WebElement getSearchcriteriabutton() {
		return searchcriteriabutton;
	}

	public WebElement getProductsfound() {
		return productsfound;
	}

	public WebElement getProductnotfound() {
		return productnotfound;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getIphone() {
		return iphone;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;

	}
	

}
