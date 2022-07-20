package com.qa.biskane.PageObject.PO;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.biskane.utils.TestBase;

public class ShopArt extends TestBase {
	
	@FindBy(xpath = "//a[@id='login']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='btn_send']")
	WebElement signin;
	
	@FindBy(xpath= "//a[@id='shop']")
	WebElement Shop;
	
	@FindBy(xpath= "//a[@id='catd_0'] //div[contains(text(),'Art')]")
	WebElement Artbutton;
	
	@FindBy(xpath = "//select[@id='productFilter']")
	WebElement SelectButton;
	
	@FindBy(xpath ="//a[@id='home']")
	WebElement HomeIcon;
	
	
	public ShopArt() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

		public void User_Clicks_on_the_login_button() {
			LoginButton.click();
		}

		public void User_Enters_Email_Password() {
			username.click();
			username.sendKeys("pooja@katchintech.com");
			password.click();
			password.sendKeys("Cust@123");
			
		}

		public void user_Clicks_Signin() {
			signin.click();
			
		}
		
		public void User_clicks_On_home_icon() {
			HomeIcon.click();
			
		}

		public void user_hovers_the_Shoplink() throws Exception {
			Actions action = new Actions(driver);
			action.moveToElement(Shop).perform();
			Thread.sleep(5000);
			
			}

		public void user_clicks_on_the_Artbutton() throws Exception {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='catd_0']")));
			Artbutton.click();
			Thread.sleep(7000);
			
		}

		public void User_Selects_Handmade_filter() {
			Select drpDown = new Select(SelectButton);
			drpDown.selectByVisibleText("Handmade");
			
		}	
		}

		


		


