import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;

	public void initializedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/sandeepvalapi/git/Selenium-Framework/src/main/resources/data.properties");
		prop.load(fis);

		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		System.setProperty("webdriver.chrome.driver", "/Users/sandeepvalapi/Downloads/chromedriver");
		driver = new ChromeDriver();

	}

}
