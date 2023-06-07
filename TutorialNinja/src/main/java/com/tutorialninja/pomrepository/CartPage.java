package com.tutorialninja.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CartPage {
	
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Checkout']")
	WebElement checkout;

	public WebElement getcheckout() {
		return checkout;
	}
	@FindBy(xpath = "//a[contains(@href,'https://tutorialsninja.com/demo/index.php?route=product/product')]")
	WebElement product;
	
	@FindBy(xpath = "//div[@class='btn-group']/child::button[@data-original-title='Add to Wish List']")
	WebElement wishlist;
	
	@FindBy(xpath = "//a[text()='wish list']")
	WebElement wishlistlink;
	
	@FindBy(xpath = "//div[@id='content']/descendant::a[text()='iPhone']")
	WebElement wishlistproduct;
	@FindBy(xpath = "//img[@title='iPhone']")
	WebElement productlink;

	

	public WebElement getProductlink() {
		return productlink;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getWishlist() {
		return wishlist;
	}
	public WebElement getWishlistlink() {
		return wishlistlink;
	}
	public WebElement getWishlistproduct() {
		return wishlistproduct;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProduct() {
		return product;
	}
	
}
