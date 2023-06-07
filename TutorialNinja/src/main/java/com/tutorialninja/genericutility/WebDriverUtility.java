package com.tutorialninja.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	public WebDriver driver;
	
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
