package com.flipkart.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.PhoneBuyPage;
import com.flipkart.qa.pages.PhoneSearchResultPage;
import com.flipkart.qa.util.TestUtil;

public class PhoneSearchResultPageTest extends TestBase {
	PhoneSearchResultPage phoneSearchResultPage;
	TestUtil testUtil;
	PhoneBuyPage buyPage;
	WebDriver switchTab;

	public PhoneSearchResultPageTest() {
		super();
	}

	@BeforeSuite
	public void setup() {
		phoneSearchResultPage = new PhoneSearchResultPage();
		testUtil = new TestUtil();
	}

	@Test(priority = 2)
	public void phoneSearchPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		String title1 = phoneSearchResultPage.searchPageTitleVerify();
		// Assert.assertEquals(title1,
		// "Redmi K20 Pro In Mobiles - Buy Products Online at Best Price in India - All
		// Categories | Flipkart.com",
		// "PhoneSearchResultPageTest title in PhoneSearchResultPageTest did not
		// match");
		Assert.assertEquals(title1, prop.getProperty("phoneSearchResultTitleAssert"),
				"phoneSearchResultPageTest title in PhoneSearchResultPageTest did not match");
	}

	@Test(priority = 3)
	public void verifyCorrectSearchTest() throws InterruptedException {
		// Thread.sleep(2000);
		Assert.assertTrue(phoneSearchResultPage.verifyCorrectSearch(prop.getProperty("searchItem")),
				"Incorrect phone Search results");
	}

	@Test(priority = 4)
	public void clickOnPhoneTest() throws InterruptedException {
		phoneSearchResultPage.clickOnPhone();
		Thread.sleep(2000);
		switchTab = testUtil.switchTab();
	}
}