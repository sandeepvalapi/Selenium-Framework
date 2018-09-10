import java.io.IOException;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Sitelogin;

public class Landingpage extends base
{
	
	public WebDriver driver;
	
 @Test(dataProvider="getData")
 public void launchbrowser(String Username, String Password, String Text) throws IOException 
 { 
	 initializedriver();
     driver.get("http://www.qaclickacademy.com/"); 
 
	 Homepage hp = new Homepage(driver);
	 hp.login().click();
 
     Sitelogin sl=new Sitelogin(driver);
	 sl.getEmail().sendKeys(Username);
	 sl.getPassword().sendKeys(Password);
	 sl.getloginbtn().click();
	 System.out.println(Text);
	 driver.close();
 }
	 @DataProvider
	 public Object[][] getData()
	 
	 {
		 Object[][] data = new Object[2][3];
		
		 //1st data set
		 data[0][0]="renukamucharla@gmail.com";
		 data[0][1]="9876543210";
		 data[0][2]="valid user";
		 
		 
		//2nd data set
		 data[1][0]="renuka@gmail.com";
		 data[1][1]="6543210";
		 data[1][2]="Invalid User";
		
		 
		 return data;
     }
	 
}

