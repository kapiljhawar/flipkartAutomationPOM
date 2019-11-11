package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "(//div[@class=\"_2aUbKa\"])[1]")
	WebElement accountUserName;

	@FindBy(xpath = "//div[@class=\"O8ZS_U\"]")
	WebElement SearchBar;

	@FindBy(xpath = "//input[@class=\"LM6RPg\"]")
	WebElement searchBar1;

	@FindBy(xpath = "//img[@title=\"Flipkart\"]")
	WebElement FlipkartPlusLogo;

	@FindBy(xpath = "(//div[@class=\"_3aS5mM _2V3TtE\"])[1]")
	WebElement MailUs;

	@FindBy(xpath = "//button[@class=\"vh79eN\"]")
	WebElement searchClick;

	@FindBy(xpath = "//div[@class='_3K4_9Q']")
	WebElement cartClick;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String accountUserName() {
		accountUserName.isDisplayed();
		return accountUserName.getText();
	}

	public void clickSearchItem() {
		SearchBar.click();
	}

	public void mobileSearchItem(String mobileSearchItem) {
		searchBar1.sendKeys(mobileSearchItem);
	}

	public void applicancesSearchItem(String applicancesSearchItem) {
		searchBar1.sendKeys(applicancesSearchItem);
	}

	public void bookSearchItem(String bookSearchItem) {
		searchBar1.sendKeys(bookSearchItem);
	}

	public PhoneSearchResultPage searchClick() {
		searchClick.click();
		return new PhoneSearchResultPage();
	}

	public CartPage cartClick() {
		cartClick.click();
		return new CartPage();
	}
}
