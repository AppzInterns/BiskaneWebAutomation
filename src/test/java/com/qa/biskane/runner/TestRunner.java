package com.qa.biskane.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = {"com/qa/biskane/StepDefinition", "biskaneHooks" },
		monochrome = true,
		dryRun = false,
		publish = true,
		tags = "@Artistsignup",
		
		plugin= {"pretty", "html:target/cucumber.html",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml"}	
		
		)

public class TestRunner {
	
	
	

}
