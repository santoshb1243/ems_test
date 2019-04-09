package com.emSigner.lib.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class CreateDriver {
	
	public static WebDriver getDriverInstance() {
		WebDriver driver = null;
	//String browse=null;
	String bowser=DataHandler.getDataFrompropfile("testp","browser").toLowerCase();
	String url=DataHandler.getDataFrompropfile("testp","test_url");
	
	if(bowser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./browser_servers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	    
	//return driver;
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
	return driver;
	}	
}
