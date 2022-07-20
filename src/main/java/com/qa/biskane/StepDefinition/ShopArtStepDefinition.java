package com.qa.biskane.StepDefinition;

import org.junit.Assert;

import com.qa.biskane.PageObject.PO.ShopArt;
import com.qa.biskane.utils.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopArtStepDefinition extends TestBase{
	
	ShopArt shopart = new ShopArt();
	
	 @Given("^User is on homepage$")
	    public void user_is_on_homepage() throws Throwable {
		 String title = shopart.verifyHomePageTitle();
		 Assert.assertEquals("NATIVE AMERICAN AND INDIGENOUS ARTS", title);
		 System.out.println("AssertEquals Test Passed/n");
	       
	    }
	 
	 @When("^user clicks on the login button$")
	    public void user_clicks_on_the_login_button() throws Throwable {
	      shopart.User_Clicks_on_the_login_button();
	    }
	 

	    @Then("^user enters email and password$")
	    public void user_enters_email_and_password() throws Throwable {
	       shopart.User_Enters_Email_Password();
	    }
	    
	    @And("^user clicks the login button$")
	    public void user_clicks_the_login_button() throws Throwable {
	        shopart.user_Clicks_Signin();
	    }
	    
	    @When("^user is on home page$")
	    public void user_is_on_home_page() throws Throwable {
	        shopart.User_clicks_On_home_icon();
	    }
	    

	    @When("^user hovers on the shop link$")
	    public void user_hovers_on_the_shop_link() throws Throwable {
	       shopart.user_hovers_the_Shoplink();
	    }
	    
	    @Then("^user clicks on the Art button$")
	    public void user_clicks_on_the_art_button() throws Throwable {
	        shopart.user_clicks_on_the_Artbutton();
	    }
	    
	    @And("^user selects the Handmade filter$")
	    public void user_selects_the_handmade_filter() throws Throwable {
	        shopart.User_Selects_Handmade_filter();
	    }
}
