package com.qa.biskane.runner;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
			
			features = "Feature/",
			glue = {"com/qa/biskane/StepDefinition", "biskaneHooks" },
			monochrome = true,
			dryRun = false,
			publish = true,
			tags = "@Userlogin",
					
			plugin= {"pretty", "html:target/cucumber.html",
					"json:target/cucumber.json",
					"junit:target/cucumber.xml",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"rerun:target/failed_scenarios.txt"} 
			)

public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}


			


