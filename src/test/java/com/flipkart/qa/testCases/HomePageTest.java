package com.flipkart.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.PhoneSearchResultPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	PhoneSearchResultPage phoneSearchResultPage;

	public HomePageTest() {
		super();
	}

	@BeforeSuite
	public void setup() {
		homePage = new HomePage();
		phoneSearchResultPage = new PhoneSearchResultPage();
	}

	@Test(priority = 2)
	public void accountUserNameTest() throws InterruptedException {
		Thread.sleep(1000);
		String accountOwnerName = homePage.accountUserName();
		Assert.assertTrue(accountOwnerName.equalsIgnoreCase(prop.getProperty("accountName")));
	}

	@Test(priority = 3)
	public void clickSearchItemTest() throws InterruptedException {
		Thread.sleep(1000);
		homePage.clickSearchItem();
	}

	@Test(priority = 4)
	public void sendSearchItemTest() throws InterruptedException {
		Thread.sleep(1000);
		homePage.sendSearchItem(prop.getProperty("searchItem"));
	}

	@Test(priority = 5)
	public void searchClickTest() throws InterruptedException {
		Thread.sleep(2000);
		phoneSearchResultPage = homePage.searchClick();
	}

}
