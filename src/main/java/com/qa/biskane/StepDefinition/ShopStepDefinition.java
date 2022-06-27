package com.qa.biskane.StepDefinition;

import org.openqa.selenium.By;

import com.qa.biskane.PageObject.PO.ShopBiskane;
import com.qa.biskane.utils.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopStepDefinition extends TestBase{
	
	ShopBiskane shopbiskane = new ShopBiskane();
	
	@When("^user click on the shop link$")
    public void user_click_on_the_shop_link() throws Throwable {
		shopbiskane.UserClicksOnTheShopLink();
		
//		driver.findElement(By.xpath("//a[@routerlink='/shop-Indigenous']/parent::*")).click();
//		Thread.sleep(5000);
		
	
       }
	@Then("^user clicks on the books link$")
    public void user_clicks_on_the_books_link() throws Throwable {
		shopbiskane.UserClicksOnTheBooksLink();
		
//		driver.findElement(By.xpath("//li[@data-url='/categories/8c202d79-c474-4dfb-b34e-329346e8f88b/book-categories']/child::a")).click();
//		Thread.sleep(5000);
    }
	
//	@Then("^user search book by author name$")
//    public void user_search_book_by_author_name() throws Throwable {
//       
//    }



}
