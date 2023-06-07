package com.tutorialninja.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tutorialninja.pomrepository.HomePage;
import com.tutorialninja.pomrepository.LogInPage;

public class Base {
	public WebDriver driver;
	public FileUtility FileUtils = new FileUtility();
	public WebDriverUtility WebUtils = new WebDriverUtility();
	public JavaUtility JavaUtils = new JavaUtility();
	
	@BeforeMethod
	public void configBeforeMethod() throws IOException
	{
		String browsername = FileUtils.readCommonData("browsername");
		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver = new EdgeDriver();
			
		}
		driver.get(FileUtils.readCommonData("url"));
		driver.manage().window().maximize();
		
	}
	
	public void ClickonLogin(WebDriver driver)
	{
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		
	}
	public void ClickOnRegister()
	{
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getRegister().click();
	}
	public void LoginToAccount() throws IOException
	{
		ClickonLogin(driver);
		LogInPage lp= new LogInPage(driver);
		lp.getEmailfield().sendKeys(FileUtils.readCommonData("email"));
		lp.getPasswordfield().click();
		lp.getPasswordfield().sendKeys(FileUtils.readCommonData("password"));
		lp.getLoginbtn().submit();
	}
	
	@AfterMethod 
	public void configAfterMethod()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
	

}
