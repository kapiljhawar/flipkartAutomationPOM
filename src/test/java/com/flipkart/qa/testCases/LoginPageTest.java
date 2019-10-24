package com.flipkart.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;

@SuppressWarnings("unused")
public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	// Test Cases should be independent -- no dependency with each other
	@BeforeSuite
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.getCurrentTitle();
		// Assert.assertEquals(title,
		// "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery,
		// Lifestyle, Books & More. Best Offers!",
		// "WebPage title in Login Page did not match");
		Assert.assertEquals(title,
				prop.getProperty("loginPageTitleAsssert"), "WebPage title in Login Page did not match");
	}

	@Test(priority = 2)
	public void flipkartLogoImageTest() {
		boolean flag = loginPage.flipkartLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginTest() throws InterruptedException {
		homepage = loginPage.flipkartLogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
	}

	// @AfterSuite
	// public void teardown() {
	// driver.quit();
	// }

}
