package org.iit.openmrs.tests;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDropDown {
	@Test
	public void validAutoSuggest() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/descendant::li"));

		System.out.println(list.size());
		for(int i=0; i<10; i++)
		{
			String s= list.get(i).getText();
			System.out.println(s);
			if(s.contains("selenium python"))
			{
				list.get(i).click();
				break;
			}

		}

	}
}