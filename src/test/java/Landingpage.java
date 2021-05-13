import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import pageobjects.Homepage;
import pageobjects.Sitelogin;

public class Landingpage extends base {

	@Test
	public void launchbrowser() throws IOException, InterruptedException {
		
		initializedriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.hhh.com/en");

		Homepage hp = new Homepage(driver);
		//hp.getHover().click();

		Sitelogin sl = new Sitelogin(driver);
		sl.getsignIn().click();
//		sl.getEmail().sendKeys("xxx@gmail.com");
//		sl.clickContinue().click();
//		sl.getPassword().sendKeys("");
//		sl.getloginbtn().click();
		driver.close();
	}
	
	public Object[][] getData()

	{
		Object[][] data = new Object[2][3];

		// 1st data set
		data[0][0] = "renukamucharla@gmail.com";
		data[0][1] = "9876543210";
		data[0][2] = "valid user";

		// 2nd data set
		data[1][0] = "renuka@gmail.com";
		data[1][1] = "6543210";
		data[1][2] = "Invalid User";

		return data;
	}

}
