package com.qa.hrm.pages;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	WebDriver driver;// null

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	// Get Page Title
	public String getPageTitle() {
		System.out.println("Driver value in basePage-" + driver);
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public WebElement getWebElement(By elmLocator) {
		WebElement elm = driver.findElement(elmLocator);
		return elm;
	}

	public boolean isElmPresent(By elmLocator) {
		return driver.findElement(elmLocator).isDisplayed();
	}

	//optional
	public <TPage extends BasePage> TPage getPageInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// non generic-- 2nd way to create object without new keyword
//	public void getNonGenericInstance() {
//		try {
//			LoginPage ref = (LoginPage) Class.forName("LoginPage").newInstance();
//			try {
//				LoginPage lp = (LoginPage) ref.newInstance();
//			} catch (Exception e) {
//
//				e.printStackTrace();
//			}
//		} catch (ClassNotFoundException e) {
//
//			e.printStackTrace();
//		}
//	}

	//// findMultiple Elmns
	// count elmns size

}
