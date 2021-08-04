package com.qa.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPwdPage extends BasePage {
	public ForgotPwdPage(WebDriver driver) {
		super(driver);
		 
	}
	private By txtUserName = By.id("securityAuthentication_userName");
	private By btnRestPwd = By.id("btnSearchValues");
	private By btnCancel = By.id("btnCancel");

	public WebElement getTxtUserName() {
		return getWebElement(txtUserName);
	}

	public WebElement getBtnRestPwd() {
		return getWebElement(btnRestPwd);
	}

	public WebElement getBtnCancel() {
		return getWebElement(btnCancel);
	}
		
	//ResetPwd
	public void doResetPwd() {
		getTxtUserName().sendKeys("Admin");
		getBtnRestPwd().click();
	}
	//Cancel
	public void doCancelResetPwd() {
		getBtnCancel().click();
	}
	

}
