package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	WebDriver chDriver;// null

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite........");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest........");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class........");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod........");
	}

	@Test
	public void a() {
		System.out.println("@Test..appLaunch..");

	}

	@Test
	public void b() {
		System.out.println("@Test..login..");

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("@AfterMethod.....");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class......");
		// chDriver.close();//?????????
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest........");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite........");
	}

}
