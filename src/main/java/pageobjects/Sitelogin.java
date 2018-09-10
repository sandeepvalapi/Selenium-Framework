package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sitelogin 
{
	public WebDriver driver;
  By email = By.id("user_email");
  By password = By.id("user_password");
  By loginbtn = By.name("commit");
  
  public Sitelogin(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  
  public WebElement getEmail()
  {
	 return driver.findElement(email); 
  }
  
  public WebElement getPassword()
  {
	 return driver.findElement(password); 
  }
  
  public WebElement getloginbtn()
  {
	 return driver.findElement(loginbtn); 
  }
  
  
  
}
