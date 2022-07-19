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
	
	@Then("user search book by title name")
	public void user_search_book_by_title_name() throws Exception {
	    shopbiskane.UserSeachBookByTitleName();
	}
	
	@When("^user clicks on a BuyNow button$")
    public void user_clicks_on_a_buynow_button() throws Throwable {
        shopbiskane.UserClicksOnBuyNowButton();
    }
	
	@Then("user scrolls down to the bottom of the page")
	public void user_scrolls_down_to_the_bottom_of_the_page() throws Exception {
	    shopbiskane.UserScrollsToTheBottom();
	}
	
	@Then("^user clicks on the buy now button$")
    public void user_clicks_on_the_buy_now_button() throws Throwable {
        shopbiskane.User_clicks_on_buy_now_button();
    }
	
//	@Then("^user clicks on add to cart button$")
//    public void user_clicks_on_add_to_cart_button() throws Throwable {
//       shopbiskane.UserClicksOnAddToCart();
//       Thread.sleep(5000);
//       
//	}
	
	@Then("^user scrolls up the page$")
    public void user_scrolls_up_the_page() throws Throwable {
        shopbiskane.User_scroll_Up();
        Thread.sleep(5000);
    }
	
//	@When("^user clicks on the cart icon$")
//    public void user_clicks_on_the_cart_icon() throws Exception {
//        shopbiskane.UserClicksOnTheCartIcon();
//    }

	}


