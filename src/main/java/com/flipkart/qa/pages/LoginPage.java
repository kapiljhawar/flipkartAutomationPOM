package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - Object Repository
	@FindBy(xpath = "//input[@class=\"_2zrpKA _1dBPDZ\"]")
	WebElement username;

	@FindBy(xpath = "//input[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")
	WebElement password;

	@FindBy(xpath = "//button[@class=\"_2AkmmA _1LctnI _7UHT_c\"]")
	WebElement loginbtn;

	@FindBy(xpath = "//a[@class=\"oZoRPi\"]")
	WebElement signUp;

	@FindBy(xpath = "//img[@class=\"_1e_EAo\"]")
	WebElement FlipkartLogo;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String getCurrentTitle() {
		return driver.getTitle();
	}

	// Logo Test
	public boolean flipkartLogo() {
		return FlipkartLogo.isDisplayed();
	}

	// Login Flipkart
	public HomePage flipkartLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}

	// Sign Up
	public static void signUp() {

	}

	// Forgot Password
	public static void forgotPassword() {

	}

}
