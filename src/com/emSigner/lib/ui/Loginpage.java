package com.emSigner.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	private static WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public static void setDriver(WebDriver driver) {
		Loginpage.driver = driver;
	}


	public static void WaitForLoginPageToLoad() {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='main-section']"))));
	}

	public static WebElement Loginbtn() {
		try {
			WebElement ele = driver.findElement(By.linkText("LOGIN"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public static WebElement userNameTextBox() {
		try {
			return driver.findElement(By.id("UserName"));

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public static WebElement passwordTextBox() {
		try {
			return driver.findElement(By.id("Password"));
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public static WebElement LoginButton() {
		try {
			return driver.findElement(By.id("btnLogin"));
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public static void dsb() {
		WebDriverWait dsw = new WebDriverWait(driver, 60);
		dsw.until(ExpectedConditions.titleContains("Dashboard- emSigner"));

	}

}
