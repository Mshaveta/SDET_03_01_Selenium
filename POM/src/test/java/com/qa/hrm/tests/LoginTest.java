package com.qa.hrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hrm.pages.HomePage;

 

public class LoginTest extends BaseTest {
	
	@Test
	public void verifyLoginWithValidCreds() throws InterruptedException {
		
		HomePage homePage =  loginPage.doLogin(adminUname,adminPwd);
		//Validation for Logout Elmn Present 
		boolean logOutElmn = homePage.isLogoutDisp();//true
		Assert.assertTrue(logOutElmn);
		
			
	}
}
