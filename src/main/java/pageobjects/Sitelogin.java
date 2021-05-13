package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sitelogin {
	public WebDriver driver;
//	By email = By.xpath("//*[@id='ap_email']");
//	By password = By.xpath("//*[@id='ap_password']");
//	By loginbtn = By.xpath("//*[@id='signInSubmit']");
//	By continueById = By.xpath("//*[@id='continue']");
	
	By signIn = By.xpath("/html/body/div[1]/main/header/div/div[2]/div[4]/div/div[2]/ul/li[2]/a");
		

	public Sitelogin(WebDriver driver) {
		this.driver = driver;
	}
	
	
//	public WebElement clickContinue() {
//		return driver.findElement(continueById);
//	}
//	
//	
//	public WebElement getEmail() {
//		return driver.findElement(email);
//	}
//
//	public WebElement getPassword() {
//		return driver.findElement(password);
//	}
//
//	public WebElement getloginbtn() {
//		return driver.findElement(loginbtn);
//	}
	
	public WebElement getsignIn() {
		return driver.findElement(signIn);
	}

}
