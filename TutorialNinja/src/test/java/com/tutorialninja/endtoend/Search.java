package com.tutorialninja.endtoend;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.HomePage;
import com.tutorialninja.pomrepository.LogInPage;
import com.tutorialninja.pomrepository.MainPage;

public class Search extends Base{
	
	@Test
	public void SearchWithExisitingProductName() throws IOException, InterruptedException
	{
		
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchbutton().click();
		assertTrue(mp.getIphone().isDisplayed());
		
	}
	@Test
	public void SearchWithNonExistingProductName() throws IOException
	{
		
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(JavaUtils.TimeStamp());
		mp.getSearchbutton().click();
		assertTrue(mp.getProductnotfound().isDisplayed());
		
		
	}
	@Test
	public void SearchWithoutAnyProductName()
	{
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("");
		mp.getSearchbutton().click();
		assertTrue(mp.getProductnotfound().isDisplayed());
		
	}
	@Test
	
	public void SearchWithValidProductAfterLogin() throws IOException
	{
		LoginToAccount();
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchbutton().click();
		assertTrue(mp.getIphone().isDisplayed());
		
	}
	
	@Test
	public void SearchWithMultiplecriteriaProduct() throws IOException
	{
		LoginToAccount();
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("multipleproduct"));
		mp.getSearchbutton().click();
		assertTrue(mp.getProductsfound().isDisplayed());
	}
	
	@Test
	public void VerifySearchPlaceHolder() throws IOException
	{
		MainPage mp = new MainPage(driver);
		assertTrue(mp.getSearchbox().getAttribute("placeholder").equals(FileUtils.readCommonData("placeholdersearchbox")));
		
	}
	
	@Test
	public void VerifyUsingSearchcriteriaField() throws IOException
	{
		MainPage mp = new MainPage(driver);
		mp.getSearchbutton().click();
		mp.getSearchcriteria().click();
		mp.getSearchcriteria().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchcriteriabutton().click();
		assertTrue(mp.getIphone().isDisplayed());
		
	}
	@Test
	public void VerifySearchcriteriaUSingProductDescription() throws IOException
	{
		MainPage mp = new MainPage(driver);
		mp.getSearchbutton().click();
		mp.getSearchcriteria().click();
		mp.getSearchcriteria().sendKeys(FileUtils.readCommonData("productdescription"));
		mp.getSearchcriteriabutton().click();
		assertTrue(mp.getIphone().isDisplayed());
	}
	@Test
	public void VerifySearchCriteriaBySelectingCategory() throws IOException
	{	WebUtils.implicitWait(driver);
		MainPage mp = new MainPage(driver);
		mp.getSearchbutton().click();
		mp.getSearchcriteria().sendKeys(FileUtils.readCommonData("searchproduct"));
		Select category = new Select(mp.getCategorydropdown());
		mp.getCategorydropdown().click();
		category.selectByValue("24");
		
		mp.getSearchcriteriabutton().click();
		assertTrue(mp.getIphone().isDisplayed());
	}
	@Test
	public void VerifySearchCriteriaBySubCategories() throws IOException
	{
		WebUtils.implicitWait(driver);
		MainPage mp = new MainPage(driver);
		mp.getSearchbutton().click();
		mp.getSearchcriteria().click();
		mp.getSearchcriteria().sendKeys(FileUtils.readCommonData("multipleproduct"));
		mp.getCategorydropdown().click();
		Select category = new Select(mp.getCategorydropdown());
		mp.getCategorydropdown().click();
		category.selectByValue("20");
		mp.getSubcategorycheckbox().click();
		mp.getSearchcriteriabutton().click();
		assertTrue(mp.getProductsfound().isDisplayed());
		
	}
	
	@Test
	public void VerifyProductCompareLink() throws IOException
	{
		MainPage mp=new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys(FileUtils.readCommonData("searchproduct"));
		mp.getSearchbutton().click();
		mp.getProductcomparelink().click();
		assertTrue(mp.getProductcomparepage().isDisplayed());
	}
	
		
	

}
