package com.emSigner.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Changepass {
	WebDriver driver;

	public  Changepass(WebDriver driver) {

		this.driver = driver;
	}

	public void WaitForcpassToLoad() {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='page-container row-fluid container-fluid']"))));
	}

	public WebElement displayclick() {
		try {
			WebElement ele = driver.findElement(By.xpath("//span[@class='hidden-sm hidden-xs']"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public WebElement changepassbutton() {
		try {
			WebElement ele = driver.findElement(By.xpath("//p[text()='Change Password']"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public WebElement oldPasswordTextbox() {
		try {
			WebElement ele = driver.findElement(By.id("OldPassword"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public WebElement newPasswordTextbox() {
		try {
			WebElement ele = driver.findElement(By.id("NewPassword"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public WebElement confirmPasswordTextbox() {
		try {
			WebElement ele = driver.findElement(By.id("ConfirmPassword"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

	public WebElement Changepwdbutton() {
		try {
			WebElement ele = driver.findElement(By.xpath("//input[@id='btnChangepwd']"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}
	public WebElement settingsbutton() {
		try {
			WebElement ele = driver.findElement(By.linkText("Settings"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}
	public WebElement okbutton() {
		try {
			WebElement ele = driver.findElement(By.linkText("Ok"));
			return ele;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return null;
		}
	}

}
