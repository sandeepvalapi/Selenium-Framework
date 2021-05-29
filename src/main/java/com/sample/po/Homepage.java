package com.sample.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public WebDriver driver;
	By login = By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	By hoverSignIn = By.xpath("//*[@id='nav-link-accountList']");
	By signIn = By.xpath("/html/body/div[1]/main/header/div/div[2]/div[4]/div/div[2]/ul/li[2]/a");
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement login() {
		return driver.findElement(login);
	}
	
	public WebElement getHover() {
		return driver.findElement(hoverSignIn);
	}
	
	public WebElement clickOnSignInLink() {
		return driver.findElement(signIn);
	}
}
