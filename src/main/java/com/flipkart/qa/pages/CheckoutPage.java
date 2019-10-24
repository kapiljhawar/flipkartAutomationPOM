package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class CheckoutPage extends TestBase {

	@FindBy(xpath = "//button[@class=\"_2AkmmA _I6-pD _7UHT_c\"]")
	WebElement deliverHereClick;

	@FindBy(xpath = "//button[contains(text(), 'CONTINUE')]")
	WebElement continueClick;

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public String phoneCheckoutPageTitleVerify() {
		return driver.getTitle();
	}

	public void deliverHereClick() {
		deliverHereClick.click();
	}

	public void continueClick() {
		continueClick.click();
	}

}