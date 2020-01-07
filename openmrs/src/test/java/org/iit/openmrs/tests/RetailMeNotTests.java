package org.iit.openmrs.tests;

import org.iit.retailmenot.pages.BasePage;

import org.iit.retailmenot.pages.DealsPage;

import org.iit.retailmenot.pages.HomePage;
import org.testng.annotations.Test;
import junit.framework.Assert;

//Go to retailmenot.com
//click on new year deals.
//check deals available in a particular category and verify the count of deals of that category.


public class RetailMeNotTests extends BasePage {
	@Test
	public void validate() throws InterruptedException
	{
		HomePage hPage = new HomePage(driver);
		hPage.verifyTitle();
		hPage.navigate("New Year Deals");


		DealsPage dPage = new DealsPage(driver);
		int actual = dPage.retrieveDealCount("Best of New Year Deals");

		int expected = 8;
		Assert.assertEquals(expected, actual);


		
	}










}