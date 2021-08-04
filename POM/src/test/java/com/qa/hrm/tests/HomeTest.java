package com.qa.hrm.tests;

import org.testng.annotations.Test;

import com.qa.hrm.pages.HomePage;

public class HomeTest extends BaseTest {
	@Test 
	public void verfiyLogOut() {
		//Step1: Login to the application
		HomePage homePage = loginPage.doLogin(adminUname,adminPwd);
		//Step2: Logout
		System.out.println("HomePage - "+homePage);
		homePage.doLogOut();
	}
}
