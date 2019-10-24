package com.flipkart.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.CheckoutPage;

public class CheckoutPageTest extends TestBase {

	CheckoutPage checkoutPage;

	public CheckoutPageTest() {
		super();
	}

	@BeforeSuite
	public void setup() {
		checkoutPage = new CheckoutPage();
	}

	@Test(priority = 2)
	public void checkoutPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		String result2 = checkoutPage.phoneCheckoutPageTitleVerify();
		// Assert.assertEquals(result2,
		// "Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order
		// > Place Order");
		Assert.assertEquals(result2, prop.getProperty("checkoutTitleAssert"));
	}

	@Test(priority = 3)
	public void deliverHereClick() throws InterruptedException {
		Thread.sleep(2000);
		checkoutPage.deliverHereClick();
	}

	@Test(priority = 4)
	public void continueClick() throws InterruptedException {
		Thread.sleep(5000);
		checkoutPage.continueClick();
		System.out.println("The Browser will close in 3 Secs...");
		Thread.sleep(3000);
		quitBrowser();
	}

}
