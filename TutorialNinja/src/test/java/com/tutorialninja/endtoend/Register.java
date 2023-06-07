package com.tutorialninja.endtoend;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.RegisterPage;

public class Register extends Base {
	@Test(priority = 1)
	public void RegisterByProvidingValidCredentials() throws IOException, InterruptedException {
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();

		registerpage.getFirstnamefield().sendKeys(FileUtils.readCommonData("firstname"));
		registerpage.getLastnamefield().click();

		registerpage.getLastnamefield().sendKeys(FileUtils.readCommonData("lastname"));
		registerpage.getEmailfield().click();

		registerpage.getEmailfield().sendKeys(FileUtils.readCommonData("emailid"));
		registerpage.getPasswordfield().click();

		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys(FileUtils.readCommonData("telephone"));
		registerpage.getPasswordfield().sendKeys(FileUtils.readCommonData("pass"));
		registerpage.getPasswordconfirmfield().click();

		registerpage.getPasswordconfirmfield().sendKeys(FileUtils.readCommonData("passconfirm"));
		registerpage.getPrivacyCheckbox().click();

		registerpage.getContinuebutton().click();

		assertTrue(registerpage.getRegistrationsuccess().isDisplayed());

	}
	

	@Test
	public void RegistrationByProvidingExistingEmail() throws IOException,InterruptedException {
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys(FileUtils.readCommonData("emailid"));
		registerpage.getPasswordfield().click();
        registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getPasswordfield().sendKeys(JavaUtils.TimeStamp());
		Thread.sleep(5000);
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getPrivacyCheckbox().click();
		registerpage.getContinuebutton().click();
		assertTrue(registerpage.getExistingemailwarning().isDisplayed());
	}
	
	@Test
	public void RegistrationByWithoutSelectingPrivacyCheckBox()
	{
		ClickOnRegister();
		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys(JavaUtils.TimeStamp()+"@gmail.com");
		registerpage.getPasswordfield().click();
        registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getPasswordfield().sendKeys(JavaUtils.TimeStamp());
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getContinuebutton().click();
		assertTrue(registerpage.getPrivacywarning().isDisplayed());
		
		
		
	}
	public void RegistrationByProvidingAllFields()
	{
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys(JavaUtils.TimeStamp()+"@gmail.com");
		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getPasswordfield().click();
		registerpage.getPasswordfield().sendKeys(JavaUtils.TimeStamp());
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getSubscribeYesRadio().click();
		registerpage.getPrivacyCheckbox().click();
		registerpage.getContinuebutton().submit();
		assertTrue(registerpage.getRegistrationsuccess().isDisplayed());
		
	}
	@Test
	public void RegistrationByProvidingDifferentPasswords() throws IOException
	{
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys(JavaUtils.TimeStamp()+"@gmail.com");
		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getPasswordfield().click();
		registerpage.getPasswordfield().sendKeys(FileUtils.readCommonData("pass"));
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getPrivacyCheckbox().click();
		registerpage.getContinuebutton().submit();
		assertTrue(registerpage.getPasswordwarning().isDisplayed());
		
	}
	
	@Test
	public void RegistrationByNotprovidingConfirmPassword() throws IOException
	{
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys(JavaUtils.TimeStamp()+"@gmail.com");
		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys(JavaUtils.TimeStamp());
		registerpage.getPasswordfield().click();
		registerpage.getPasswordfield().sendKeys(FileUtils.readCommonData("pass"));
		
		registerpage.getPrivacyCheckbox().click();
		
		registerpage.getContinuebutton().submit();
		assertTrue(registerpage.getPasswordconfirmwarning().getText().equalsIgnoreCase(FileUtils.readCommonData("passwordconfirmwarning")));
	}

}
