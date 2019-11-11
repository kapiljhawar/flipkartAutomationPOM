package com.flipkart.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	public static String configPropertiesPath = "C:\\Users\\kapil.jhawar\\FlipkartAutomation\\Flipkart\\src\\main"
			+ "\\java\\com\\flipkart\\qa\\config\\config.properties";
	public static String url = "https://www.flipkart.com";

	// Reading file from text file
	public TestBase() {
		File file = new File(configPropertiesPath);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("object Repository File not Found Exception in file path");
		}
		prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("Null Pointer Exception path not defined");
		}
	}

	// browser Initialization
	public void initialization() {
		String browserName = prop.getProperty("browserName");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Lib\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("IE")) {
		}

		else if (browserName.equalsIgnoreCase("Safari")) {

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeouts, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url")); // Launching flipkart.com
	}

	// Decryption of String
	public static byte[] DecodeBase64Java(String EncryptedPass) {
		byte[] decodePwd = Base64.getDecoder().decode(EncryptedPass);
		return decodePwd;
	}

	public void quitBrowser() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}
