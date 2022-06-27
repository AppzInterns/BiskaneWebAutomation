package com.qa.biskane.StepDefinition;

import com.qa.biskane.PageObject.PO.HomePage;
import com.qa.biskane.utils.TestBase;
import org.junit.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDefintion extends TestBase {
	
	HomePage homepage = new HomePage();
	
	@Given("I verify homepage is visible")
	public void i_verify_homepage_is_visible() {
	    TestBase.initialization();
	}
	@Then("I verify homepage title is as expected")
	public void i_verify_homepage_title_is_as_expected() {
		 String title = homepage.verifyHomePageTitle();
		 Assert.assertEquals("NATIVE AMERICAN AND INDIGENOUS ARTS", title);
		 System.out.println("AssertEquals Test Passed/n");

	}
	@Then("I verify logo is visible")
	public void i_verify_logo_is_visible() {
		Assert.assertTrue(homepage.ValidateBiskaneLogo()); 
	}


}
//("NATIVE AMERICAN AND INDIGENOUS ART", title);