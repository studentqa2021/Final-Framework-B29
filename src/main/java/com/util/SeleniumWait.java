package com.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	// polymorphism = over loading or compile time or static binding
	public  static void  implicitWait(WebDriver driver, long seconds){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public static void pageLoadTimeOut(WebDriver driver,long seconds){
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
	}
	public static void ExplicitWait(WebDriver driver,WebElement element,long seconds){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public  static void  implicitWait(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	public static void pageLoadTimeOut(WebDriver driver){
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	}
	public static void ExplicitWait(WebDriver driver,WebElement element){
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
