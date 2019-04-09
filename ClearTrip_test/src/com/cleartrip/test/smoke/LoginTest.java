package com.cleartrip.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.utils.CreateDriver;

public class LoginTest {
	
	WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		driver=CreateDriver.getDriverInstance();
	}
	 @AfterMethod
	 public void postCondition()
	 {
		 driver.close();
	 }
	 @Test
	 public void testLogin() {
		 String actualTitle=driver.getTitle();
		 String expectedTitle="Cleartrip";
		 Assert.assertEquals(actualTitle, expectedTitle);
		 
	 }

}
