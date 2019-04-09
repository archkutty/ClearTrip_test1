package com.cleartrip.qa.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateDriver {

	public static WebDriver getDriverInstance() {
		WebDriver driver=null;
		String browser=DataHandlers.getDataToProperties("execution-info", "browser").toLowerCase();
		String url=DataHandlers.getDataToProperties("execution-info", "url");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./browser-servers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}
	
	
}
