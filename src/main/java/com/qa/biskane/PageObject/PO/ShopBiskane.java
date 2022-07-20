package com.qa.biskane.PageObject.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.biskane.utils.TestBase;

public class ShopBiskane extends TestBase{
	
	@FindBy(xpath= "//a[@id='shop']")
	WebElement ShopLink;
	
	@FindBy(xpath = "//a[@id='catd_2']")
	WebElement Books;
	
	@FindBy(xpath = "//a[contains(text(),'Books')]")
	WebElement shopBooks;
	
	@FindBy(xpath = "//input[@placeholder='Search by Artist, Category name, Stores, Donation etc...']")
	WebElement SearchBar;
	
	@FindBy(xpath = "//button[@class='btnblue float-right']")
	WebElement SearchButton;
	
	@FindBy(xpath = "//button[@class='btngreen']")
	WebElement BuyNow;
	
	@FindBy(xpath = "//i[@class='fa fa-shopping-cart menu-hover']")
	WebElement CartIcon;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement AddToCart;
	
	@FindBy(xpath = "//button[@class='btngreen']")
	WebElement BuyNowButton;
	
	
	
	
	public ShopBiskane() {
		PageFactory.initElements(driver, this);
	}


	public void UserClicksOnTheShopLink() {
		Actions action = new Actions(driver);
		action.moveToElement(ShopLink);
		
		
	}


	public void UserClicksOnTheBooksLink() {
		Books.click();
		
	}


	public void UserSeachBookByTitleName() throws Exception {
		Select BookTitle = new Select(driver.findElement(By.xpath("//select[@id='inlineFormCustomSelect']")));
		BookTitle.selectByVisibleText("Title");
		SearchBar.click();
		SearchBar.sendKeys("son of a trickster");
		SearchButton.click();
		Thread.sleep(5000);
		
		
	}


	public void UserClicksOnBuyNowButton() {
		BuyNow.click();
		
	}
	

	public void UserScrollsToTheBottom() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");
		Thread.sleep(8000);
		
	}
	
	public void User_clicks_on_buy_now_button() {
		BuyNowButton.click();
		
		
	}

	
//	public void UserClicksOnAddToCart() throws Exception {
//		AddToCart.click();
//		
//	}


	public void User_scroll_Up() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}


	
//	public void UserClicksOnTheCartIcon() throws Exception {
//		CartIcon.click();
//		Thread.sleep(5000);
//		
//	}

}
