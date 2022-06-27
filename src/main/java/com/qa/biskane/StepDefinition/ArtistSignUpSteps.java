package com.qa.biskane.StepDefinition;

import org.openqa.selenium.By;

import com.qa.biskane.PageObject.PO.ArtistSignUp;
import com.qa.biskane.utils.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ArtistSignUpSteps extends TestBase{
	
	ArtistSignUp artistsignup = new ArtistSignUp();
	
	@When("I hover on Signup button")
	public void i_hover_on_signup_button() throws Exception {
	   artistsignup.hoverOnSignUpLink();
	}
	@When("click on Artist signup")
	public void click_on_artist_signup() throws Exception {
	   artistsignup.clickonartistsignup();
	}
	@Then("I verify Artist signup page appears")
	public void i_verify_artist_signup_page_appears() {
	    String title = artistsignup.ArtistsignupURL();
	    Assert.assertEquals("https://www.biskane.com/artist-sign-up", title);
	    System.out.println("Assert test is passed");
	    
	}
	
	@Then("I enter \"(.*)\", \"(.*)\" , \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void I_enter_artist_details(String firstname, String lastname, String email, String phoneNumber, String pw, String confirmpw) {
		driver.findElement(By.xpath("//input[@placeholder='* First Name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@placeholder='* Last Name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@placeholder='* Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//input[@placeholder='* Password']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@placeholder='* Confirm Password']")).sendKeys(confirmpw);
	    
	}

	@When("I click on I agree checkbox")
	public void i_click_on_i_agree_checkbox() {
	    artistsignup.IclickonNextButton();
	}

}
