package com.tutorialninja.endtoend;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.CartPage;
import com.tutorialninja.pomrepository.MainPage;
import com.tutorialninja.pomrepository.ProductComparisonPage;

public class AddToCart extends Base{
	
	@Test
	public void AddProductToCartFromProductPage() throws IOException
	{
		WebUtils.implicitWait(driver);
		MainPage mp= new MainPage(driver);
		CartPage cp = new CartPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(cp.getProduct()).perform();
		cp.getProduct().click();
		mp.getAddtocartbutton().click();
		mp.getShoppingcartlink().click();
		assertTrue(cp.getcheckout().isDisplayed());
		
		
	}
	@Test
	public void AddProductToCartFromWishlist() throws IOException, InterruptedException
	{
		LoginToAccount();
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchbutton().click();
		CartPage cp = new CartPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(cp.getProduct()).perform();
		cp.getProduct().click();
		cp.getWishlist().click();
		cp.getWishlistlink().click();
		assertTrue(cp.getWishlistproduct().isDisplayed());
		
	}
	
	@Test
	public void AddProductFromSearchResultPage() throws IOException
	{
		WebUtils.implicitWait(driver);
		MainPage mp  = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchbutton().click();
		CartPage cp = new CartPage(driver);
		mp.getAddtocartsearchpage().click();
		mp.getShoppingcartlink().click();
		assertTrue(cp.getcheckout().isDisplayed());
	}
	@Test
	public void AddProductFromProductDisplayPage() throws IOException
	{
		WebUtils.implicitWait(driver);
		MainPage mp  = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchbutton().click();
		CartPage cp = new CartPage(driver);
		mp.getAddtocartbutton().click();
		mp.getShoppingcartlink().click();
		assertTrue(cp.getcheckout().isDisplayed());
		
	}
	
	@Test
	public void AddToCartFromFeaturesSection()
	{
		WebUtils.implicitWait(driver);
		MainPage mp= new MainPage(driver);
		CartPage cp = new CartPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(cp.getProduct()).perform();
		cp.getProduct().click();
		mp.getAddtocartbutton().click();
		mp.getShoppingcartlink().click();
		assertTrue(cp.getcheckout().isDisplayed());
	}
	
	@Test
	public void AddToCartFromProductComparisionPage() throws IOException
	{
		WebUtils.implicitWait(driver);
		MainPage mp=new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchbutton().click();
		mp.getCompareproductbutton().click();
		ProductComparisonPage pg= new ProductComparisonPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(pg.getProductcomparisonlink()).perform();
		
		pg.getProductcomparisonlink().click();
		ac.scrollToElement(pg.getAddtocartbutton()).perform();
		pg.getAddtocartbutton().click();
		mp.getShoppingcartlink().click();
		CartPage cp = new CartPage(driver);
		assertTrue(cp.getCheckout().isDisplayed());
		
		
	}
	
	
	
	
	

}
