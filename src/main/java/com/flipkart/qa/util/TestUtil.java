package com.flipkart.qa.util;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.flipkart.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long Page_Load_Timeouts = 20;
	public static long Implicit_Wait = 10;

	public WebDriver switchTab() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); // Storing opened tabs in ArrayList
		// System.out.println(tabs.size());
		return driver.switchTo().window(tabs.get(1));
	}
}