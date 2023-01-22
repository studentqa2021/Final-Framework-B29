package com.test.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"json:target/cucumber.json"},
		features = {"src/main/resources/Login test.feature"},
		glue = {"com.test.cucumber"},
		monochrome = true
		//dryRun = false,
		//strict = true
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
