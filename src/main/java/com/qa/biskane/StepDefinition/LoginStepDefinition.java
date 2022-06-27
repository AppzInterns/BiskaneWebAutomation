package com.qa.biskane.StepDefinition;

import org.openqa.selenium.By;

import com.qa.biskane.PageObject.PO.BiskaneLogin;
import com.qa.biskane.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends TestBase{
	
	BiskaneLogin biskanelogin = new BiskaneLogin();
	
	@Given("^User is on biskane application$")
    public void user_is_on_biskane_application() throws Throwable {
        System.out.println("User is on biskane page");
    }
	
	@When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        biskanelogin.UserClicksOnLoginButton();
    }
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_login_information(String email, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
	}
	
	@Then("^User click on the signinButton$")
    public void user_click_on_the_signinbutton() throws Throwable {
       driver.findElement(By.xpath("//button[@id='btn_send']")).click();
    }
}
