package com.qa.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	private By welcomeOpt = By.id("welcome");
	private By linkLogout = By.xpath("//a[contains(@href,'logout')]");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getWelcome() {
		return getWebElement(welcomeOpt);
	}
	public WebElement getLogOut() {
		return getWebElement(linkLogout);
	}
	
	public boolean isLogoutDisp() {
		getWelcome().click();
		try {
			Thread.sleep(2000);//static wait
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return isElmPresent(linkLogout);
	}
	public void doLogOut() {
		getWelcome().click();
		try {
			Thread.sleep(2000);//static wait
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		getLogOut().click();
		
	}
	
	

}
