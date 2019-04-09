package com.cleartrip.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("viewport"))));
		
	}
	public WebElement getUserNameTextbox()
	{
		try 
		{
			WebElement element=driver.findElement(By.name("email"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	public WebElement getPasswordTextbox()
	{
		try
		{
			WebElement element=driver.findElement(By.id("password"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	public WebElement getLoginButton()
	{
		try {
			WebElement element=driver.findElement(By.id("signInButton"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
	public WebElement getLoginErrorMsg()
	{
		try
		{
			WebElement element=driver.findElement(By.xpath("//span[text()='There were errors in your submission']"));
			return element;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
}
