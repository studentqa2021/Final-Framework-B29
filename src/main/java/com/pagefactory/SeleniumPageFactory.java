package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {
	WebDriver driver;
	public SeleniumPageFactory(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	
	// Login =application web element
	@FindBy(xpath ="(//*[@class='authorization-link'])[1]")
	private WebElement signin;
	@FindBy(xpath ="//*[@id='email']")
	private WebElement email;
	@FindBy(xpath ="//*[@title='Password']")
	private WebElement password;
	@FindBy(xpath ="(//*[@name='send'])[1]")
	private WebElement secondSignIn;
	@FindBy(xpath ="(//*[@class='action switch'])[1]")
	private WebElement arrowBtn;	
	@FindBy(xpath ="(//*[@class='authorization-link']/a)[1]")
	private WebElement signOutBtn;
	
	
	//getter method
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSecondSignIn() {
		return secondSignIn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getArrowBtn() {
		return arrowBtn;
	}
	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
	
	
	
}
