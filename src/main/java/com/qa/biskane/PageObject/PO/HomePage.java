package com.qa.biskane.PageObject.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.biskane.utils.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//img[@class='img-fluid logo_colored svca ml-3']")
	WebElement biskanelogo;
	
	@FindBy(xpath = "//a[@class = 'ng-star-inserted']")
	WebElement Login;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
	
		return driver.getTitle();
	
	}

	public boolean ValidateBiskaneLogo() {
		
		return biskanelogo.isDisplayed();
	}

}


