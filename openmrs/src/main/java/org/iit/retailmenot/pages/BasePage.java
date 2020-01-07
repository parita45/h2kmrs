package org.iit.retailmenot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	protected WebDriver driver;
	@Parameters({"url"})
	@BeforeClass
	public void launchBrowser(String url)
	{

		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("Title :" +title);

	}
}
