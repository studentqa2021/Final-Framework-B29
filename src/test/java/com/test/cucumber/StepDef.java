package com.test.cucumber;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.pagefactory.SeleniumPageFactory;
import com.util.BaseConfig;
import com.util.Contants;
import com.util.ContantsWithEncapsulation;
import com.util.HighLighter;
import com.util.ScreenShot;
import com.util.SeleniumWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	SeleniumPageFactory pf;
	WebDriver driver;
	@Given("go to application URL")
	public void getsetup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//wait =implicit ==> HTML>>HTML DOM page loaded or not>> problem =slow down automation
		SeleniumWait.implicitWait(driver, 3);
		// pageloadtime=UI/graphics >> all webelemnt loaded or not
		SeleniumWait.pageLoadTimeOut(driver, 3);
		
		pf = new SeleniumPageFactory(driver);
		
		driver.navigate().to(BaseConfig.getConfig("URL"));
		
		ScreenShot.getScreenShot(driver, "Home page");
	}

	@When("click the login button")
	public void clickLoginBtn() {
		HighLighter.getColor(driver, pf.getSignin());
		pf.getSignin().click();
		ScreenShot.getScreenShot(driver, "Login page");
	}

	@When("put user")
	public void putUser() {
		HighLighter.getColor(driver, pf.getEmail());
		pf.getEmail().sendKeys(BaseConfig.getConfig("user"));
	}

	@When("put password")
	public void addPassword() {
		HighLighter.getColor(driver, pf.getPassword());
		pf.getPassword().sendKeys(BaseConfig.getConfig("passWord"));
	}

	@When("click sign in button")
	public void clikdSignIn() {
		HighLighter.getColor(driver, pf.getSecondSignIn());
		pf.getSecondSignIn().click();
		
	}

	@Then("validation login status")
	public void validation() {
		// explicit wait = webdriver wait
		SeleniumWait.ExplicitWait(driver, pf.getArrowBtn(), 30);
		HighLighter.getColor(driver, pf.getArrowBtn());
		pf.getArrowBtn().click();
		ScreenShot.getScreenShot(driver, "Login validation");
		HighLighter.getColor(driver, pf.getSignOutBtn());
		boolean status =pf.getSignOutBtn().isDisplayed();//true = pass
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(status);
		sa.assertAll();

	}
}
