package com.flipkart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class PhoneSearchResultPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(), \"redmi k20 pro in mobiles\")]")
	WebElement searchName;

	@FindBy(xpath = "(//div[@class=\"_1vC4OE _2rQ-NK\"])[1]")
	WebElement phoneClick;

	public PhoneSearchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public String searchPageTitleVerify() {
		return driver.getTitle();
	}

	public boolean verifyCorrectSearch(String searchName) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(By.xpath("//span[contains(text(), '" + searchName + "')]")).isDisplayed();
	}

	public PhoneBuyPage clickOnPhone() {
		phoneClick.click();
		return new PhoneBuyPage();
	}
}