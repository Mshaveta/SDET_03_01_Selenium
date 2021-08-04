package com.qa.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By txtUserName = By.id("txtUsername");
	private By txtPassword = By.id("txtPassword");
	private By btnLogin = By.id("btnLogin");
	private By linkForgetPwd = By.partialLinkText("Forgot your password");

	 
	
	public WebElement getTxtUserName() {
		return getWebElement(txtUserName);
	}

	public WebElement getTxtPassword() {
		WebElement elm = getWebElement(txtPassword);
		return elm;
	}

	public WebElement getBtnLogin() {
		return getWebElement(btnLogin);
	}

	public WebElement getLinkForgetPwd() {
		return getWebElement(linkForgetPwd);
	}
	
	
	//login functionality
	public HomePage doLogin(String username, String password) {
		// driver.findElement(By.id("text")---[private Prop])--[BasepAge class]
		// .sendKeys("test"); //actionMethods
		
		getTxtUserName().sendKeys(username);
		getTxtPassword().sendKeys(password);
		getBtnLogin().click();
		//return getPageInstance(HomePage.class);
		return new HomePage(driver);
	}
	
	//click ForgetPwdLink
	public ForgotPwdPage goResetPwd() {
		//getLinkForgetPwd().click();
		//return getPageInstance(ForgotPwdPage.class);
		return new ForgotPwdPage(driver);
	}
	  

}
