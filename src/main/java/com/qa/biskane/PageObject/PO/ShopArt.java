package com.qa.biskane.PageObject.PO;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.biskane.utils.TestBase;

public class ShopArt extends TestBase {
	
	@FindBy(xpath = "//a[@id='login']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	public ShopArt() {
		PageFactory.initElements(driver, this);
	}

	
		
		public String verifyHomePageTitle() {
		
		return driver.getTitle();
	}

		public void User_Clicks_on_the_login_button() {
			LoginButton.click();
		}

}
