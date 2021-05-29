package com.sample.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sitelogin {
	public WebDriver driver;
//	By email = By.xpath("//*[@id='ap_email']");
//	By password = By.xpath("//*[@id='ap_password']");
//	By loginbtn = By.xpath("//*[@id='signInSubmit']");
//	By continueById = By.xpath("//*[@id='continue']");

	By hrfSignIn = By.xpath("//*[@id='j_username']");
	By hrfPassword = By.xpath("//*[@id='j_password']");
	By hrfLoginBtn = By.xpath("//*[@id='loginForm']/button");

	By hrfSearch = By.xpath("//*[@id='js-site-search-input']");

	By hrfShirtId = By.xpath("//*[@id='site-container']/div/div[2]/div/div[2]/div/div/div/ul/li/a[1]/div/div/img");

	By hrfMiniCart = By.xpath("//*[@id='js-mini-cart']/div[2]/div/div/a");

	By hrfClickCheckout = By.xpath("//*[@id='js-mini-cart']/div[2]/div/div/a");

	By hrfClickCheckout1 = By
			.xpath("//*[@id='site-container']/div/div/div[4]/div/div[2]/div[2]/div/div[2]/div[1]/button");

	By hrfShirtATC = By.xpath("//*[@id='addToCartButton']");

	// *[@id="site-container"]/div/div/div[4]/div/div[2]/div[2]/div/div[2]/div[1]/button

	public Sitelogin(WebDriver driver) {
		this.driver = driver;
	}

//	public WebElement clickContinue() {
//		return driver.findElement(continueById);
//	}
//	
//	
	public WebElement getEmail() {
		return driver.findElement(hrfSignIn);
	}

	public WebElement getPassword() {
		return driver.findElement(hrfPassword);
	}

//
	public WebElement getloginbtn() {
		return driver.findElement(hrfLoginBtn);
	}

	public WebElement getSearchText() {
		return driver.findElement(hrfSearch);
	}

	public WebElement getShirtId() {
		return driver.findElement(hrfShirtId);
	}

	public WebElement clickATC() {
		return driver.findElement(hrfShirtATC);
	}

	public WebElement clickMiniCart() {
		return driver.findElement(hrfMiniCart);
	}

	public WebElement clickCheckout() {
		return driver.findElement(hrfClickCheckout1);
	}

}
