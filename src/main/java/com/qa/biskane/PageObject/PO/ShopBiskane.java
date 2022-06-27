package com.qa.biskane.PageObject.PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.biskane.utils.TestBase;

public class ShopBiskane extends TestBase{
	
	@FindBy(xpath= "//a[@routerlink='/shop-Indigenous']/parent::*")
	WebElement ShopLink;
	
	@FindBy(xpath = "//a[contains(text(),'Books')]")
	WebElement shopBooks;
	
	
	public ShopBiskane() {
		PageFactory.initElements(driver, this);
	}


	public void UserClicksOnTheShopLink() {
		ShopLink.click();
		
	}


	public void UserClicksOnTheBooksLink() {
		shopBooks.click();
		
	}

}
