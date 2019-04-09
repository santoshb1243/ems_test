package com.emSigner.lib.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExternalWaitlib {
public static void waitforAlertpopup(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.alertIsPresent());
	
}
public static void waitforTile(WebDriver driver,String title) {
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.titleIs(title));
}
public static void waitforTileContains(WebDriver driver,String title) {
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.titleContains(title));
}
public static void waitforelement(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(element));
}
}
