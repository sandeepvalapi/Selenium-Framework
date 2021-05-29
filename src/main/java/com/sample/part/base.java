package com.sample.part;
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
	public String siteUrl;
	public Properties prop;

	public void initializedriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"/Users/sandeepvalapi/git/Selenium-Framework/src/main/resources/data.properties");
		prop.load(fis);

		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driver.path"));
		driver = new ChromeDriver();

		siteUrl = prop.getProperty("website.url");
		driver.get(siteUrl);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

}
