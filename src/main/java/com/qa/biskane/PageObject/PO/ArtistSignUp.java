package com.qa.biskane.PageObject.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.biskane.utils.TestBase;

public class ArtistSignUp extends TestBase{
	
	@FindBy(xpath = "(//li[@class = 'drop-down nologin']//a) [1] ")
	WebElement SignUp_DropDown;
	
	@FindBy(xpath = "//li[@data-url='/artist-sign-up']/child::a[1]")
	WebElement Artist_Signup;
	
	@FindBy(xpath="//button[@id='nextbtn']")
	WebElement NextButton;
	
	public ArtistSignUp() {
		PageFactory.initElements(driver, this);
	}

	public void hoverOnSignUpLink() throws Exception {
		Actions action = new Actions(driver);
		action.clickAndHold(SignUp_DropDown).perform();
		action.click(SignUp_DropDown).perform();
		Thread.sleep(5000);
		
	}

	public void clickonartistsignup() throws Exception {
		Artist_Signup.click();
		Thread.sleep(5000);
		
	}

	public String ArtistsignupURL() {
		
		return driver.getCurrentUrl();
	}

	public void IclickonNextButton() {
		NextButton.click();
		
		
	}

}
