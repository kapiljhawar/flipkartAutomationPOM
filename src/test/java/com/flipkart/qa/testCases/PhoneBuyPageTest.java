package com.flipkart.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.CheckoutPage;
import com.flipkart.qa.pages.PhoneBuyPage;

public class PhoneBuyPageTest extends TestBase {

	PhoneBuyPage phoneBuyPage;
	CheckoutPage checkoutPage;

	public PhoneBuyPageTest() {
		super();
	}

	@BeforeSuite
	public void setup() {
		phoneBuyPage = new PhoneBuyPage();
		checkoutPage = new CheckoutPage();
	}

	@Test(priority = 2)
	public void buyPageTitleTest() {
		String result = phoneBuyPage.phoneBuyPageTitleVerify();
		// Assert.assertEquals(result,
		// "Mi Redmi K20 Pro ( 128 GB Storage, 6 GB RAM ) Online at Best Price On
		// Flipkart.com");
		Assert.assertEquals(result,
				prop.getProperty("phoneBuyPageTitleAssert"));
	}

	@Test(priority = 3)
	public void buyNowButtonEnabledTest() {
		Assert.assertTrue(phoneBuyPage.buyNowEnabled(), "Buy Now Button Disabled");
	}

	@Test(priority = 4)
	public void buyNowButtonClick() throws InterruptedException {
		Thread.sleep(1000);
		checkoutPage = phoneBuyPage.phoneBuyNowClick();
	}
}