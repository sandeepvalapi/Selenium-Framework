package com.test.run;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;

import com.sample.part.base;
import com.sample.po.Homepage;
import com.sample.po.Sitelogin;


public class Landingpage extends base {

	@Test
	public void launchbrowser() throws IOException, InterruptedException {
		
		initializedriver();

		Homepage hp = new Homepage(driver);
		//hp.getHover().click();
		hp.clickOnSignInLink().click();
		
		Sitelogin siteLogin = new Sitelogin(driver);
		
		siteLogin.getEmail().sendKeys(prop.getProperty("login.username"));
		siteLogin.getPassword().sendKeys(prop.getProperty("login.password"));
		siteLogin.getloginbtn().click();
		
		//After Login
		
		//Global Search for Product
		siteLogin.getSearchText().sendKeys(prop.getProperty("product.shirt.id"));
		siteLogin.getSearchText().sendKeys(Keys.RETURN);
		siteLogin.getShirtId().click();
		
		
		siteLogin.clickATC().click();
		
		driver.get(prop.getProperty("website.cart.url"));
		siteLogin.clickCheckout().click();

		driver.close();
	}
	
}
