package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class PhoneBuyPage extends TestBase {

	@FindBy(xpath = "//button[@class=\"_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c\"]")
	WebElement buyNow;

	public PhoneBuyPage() {
		PageFactory.initElements(driver, this);
	}

	public String phoneBuyPageTitleVerify() {
		return driver.getTitle();
	}
	
	public boolean buyNowEnabled() {
		return buyNow.isEnabled();
	}

	public CheckoutPage phoneBuyNowClick() {
		buyNow.click();
		return new CheckoutPage();

	}
}