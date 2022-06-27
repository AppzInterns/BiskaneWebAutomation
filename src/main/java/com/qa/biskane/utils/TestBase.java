package com.qa.biskane.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()  {
		
		 try {
		    prop = new Properties();
			FileInputStream fileIS = new FileInputStream("/Users/gaganbajwa/eclipse-workspace/com.qa.biskane/src/main/java/com/qa/biskane/config/config.properties");
			
			prop.load(fileIS);
			}
			
			catch(IOException e) {
				e.getMessage();
			}
			
	}
	@SuppressWarnings("deprecation")
	public static void initialization() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/gaganbajwa/Downloads/chromedriver");		 
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
	}
}


