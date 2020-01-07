package org.iit.retailmenot.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	WebDriver driver;  //global variable

	public HomePage(WebDriver driver) //creating constructor
	{
		this.driver = driver; //assigning the value of driver to the global variable driver.
	}


	public String verifyTitle()
	{
		
		String title = driver.getTitle();
		System.out.println("The title of the page is :" +title);
		return title;
	}

	public boolean navigate(String moduleName)
	{
		driver.findElement(By.xpath("//span[contains(text(),'"+moduleName+"')]")).click();
		String title1  = driver.getTitle();
		System.out.println("The title of the page is "+title1);
		if(title1.contains("2019 Christmas"))
		{
			System.out.println("Test case passed");

		}
		return true;

	}

}
