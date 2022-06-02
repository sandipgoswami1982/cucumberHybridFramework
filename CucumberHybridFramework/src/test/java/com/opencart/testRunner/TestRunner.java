package com.opencart.testRunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features=".//Features/",
		features=".//Features/Customers.feature",
		//features={".//Features/Customers.feature",".//Features/Login.feature"},
		glue = "com.opencart.stepDefinitions",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:test-output"},
		tags= {"@sanity	,@Regression"}
		
		
		)

public class TestRunner
{

	
}
