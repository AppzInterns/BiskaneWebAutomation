package com.qa.biskane.PageObject.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.biskane.utils.TestBase;


public class BiskaneLogin extends TestBase{
	
	@FindBy(xpath="//a[@routerlink='/login'][@class='ng-star-inserted']")
	WebElement LoginButton;
	
	//@FindBy(xpath="//input[@id='name']")
	//WebElement Email;
	
	//@FindBy(xpath="//input[@id='password']")
	//WebElement PassWord;
	
	public BiskaneLogin() {
		PageFactory.initElements(driver, this);
	}

	public void UserClicksOnLoginButton() throws Exception {
		LoginButton.click();
		Thread.sleep(3000);
		
	

	
		
		
		
		
	}

}
