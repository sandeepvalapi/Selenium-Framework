import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prog1 extends base
{
	
 @Test
 public void display() throws IOException
 { 
	 initializedriver();
	 driver.get("https://www.google.com/");
	 System.out.println("Started working on frameworks");
 }
}
