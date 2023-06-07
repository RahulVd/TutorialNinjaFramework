package com.tutorialninja.endtoend;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.HomePage;
import com.tutorialninja.pomrepository.LogInPage;

public class Login extends Base {

	@Test(priority = 1)

	public void LoggingInWithValidDetails() throws IOException, InterruptedException {
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys(FileUtils.readCommonData("email"));
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys(FileUtils.readCommonData("password"));
		login.getLoginbtn().click();
		assertEquals(login.getEditYourAccountLinkText().getText(), FileUtils.readCommonData("accountcreated"));

	}

	@Test(priority = 2)
	public void LoggingInWithInvalidDetails() throws IOException {
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys(JavaUtils.TimeStamp() + "@gmail.com");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys(JavaUtils.TimeStamp());
		login.getLoginbtn().click();
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));

	}

	@Test(priority = 3)
	public void LoggingInWithInvalidEmailValidPassword() throws IOException {
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys(JavaUtils.TimeStamp() + "@gmail.com");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys(FileUtils.readCommonData("password"));
		login.getLoginbtn().click();
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));

	}
	@Test(priority = 4)
	public void LoggingInWithValidEmailInvalidPassword() throws IOException
	{
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys(FileUtils.readCommonData("email"));
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys(JavaUtils.TimeStamp());
		login.getLoginbtn().click();
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));

	}
	@Test(priority = 5)
	public void LoggingInWithoutProvidingAnyCredentials() throws IOException 
	{
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys("");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys("");
		login.getLoginbtn().click();
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));
		
	}
	@Test(priority = 6)
	public void VerifyForgottenPasswordLink() throws IOException
	{
		ClickonLogin(driver);
		LogInPage login = new LogInPage(driver);
		login.getForgottenpassword().click();
		assertEquals(login.getForgottenpasswordpage().getText(),FileUtils.readCommonData("forgottenpagepage"));
		
	}
	@Test(priority = 7)
	public void LoggingInUsingKeyboardTab() throws IOException
	{
		ClickonLogin(driver);
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys(FileUtils.readCommonData("email")+Keys.TAB);
		login.getPasswordfield().sendKeys(FileUtils.readCommonData("password")+Keys.ENTER);
		
	}
	@Test(priority = 8)
	public void LoggingInAndNavigatingBack() throws IOException
	{
		ClickonLogin(driver);
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys(FileUtils.readCommonData("email"));
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys(FileUtils.readCommonData("password"));
		login.getLoginbtn().submit();
		driver.navigate().back();
		assertTrue(login.getLoginpageverify().isDisplayed());
		}
	
}
