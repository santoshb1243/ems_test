package com.emSigner.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emSigner.lib.ui.Loginpage;
import com.emSigner.lib.utils.CreateDriver;
import com.emSigner.lib.utils.DataHandler;

public class Testsample {

	WebDriver driver;
	@BeforeMethod
	public void precondtion()
	{
		driver=CreateDriver.getDriverInstance();
	}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	@Test
	public void test1()
	{
//		Loginpage page = new Loginpage(driver);
		Loginpage.setDriver(driver);
		Loginpage.WaitForLoginPageToLoad();
		String un=DataHandler.getDataFromExcel("testtm", "sheet1", 1, 0);
		String pwd=DataHandler.getDataFromExcel("testtm", "sheet1", 1, 1);
		Loginpage.Loginbtn().click();
		Loginpage.userNameTextBox().sendKeys(un);
		Loginpage.passwordTextBox().sendKeys(pwd);
		Loginpage.LoginButton().click();
	}
}
