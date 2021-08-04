package com.qa.hrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.hrm.pages.LoginPage;
import com.qa.hrm.utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	ReadConfig config;
	WebDriver driver;
	LoginPage loginPage;// null
	String adminUname;
	String adminPwd;
	 

	@BeforeClass
	public void setUp() {
		config = new ReadConfig();
		String browser = config.getBrowser();

		adminUname = config.getAdminUname();
		adminPwd = config.getAdminPwd();

		if (browser.equalsIgnoreCase("chrome")) {
			// Browser Launch
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();// chrome driver abc5694869ngnfhglknhlk56757
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		// System.out.println("Driver value in baseTest-"+ driver);
		// Application Launch

		String appUrl = config.getAppUrl();
		driver.get(appUrl);

		loginPage = new LoginPage(driver);

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
