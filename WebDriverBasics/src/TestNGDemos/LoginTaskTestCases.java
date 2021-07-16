package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTaskTestCases {
	WebDriver chDriver;

	@BeforeMethod
	public void browserLaunch()
	{
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		chDriver = new ChromeDriver();
		 
		chDriver.get("https://opensource-demo.orangehrmlive.com/");

	}

	/*
	 * @Test public void appLaunch() { //System.out.println("@test.app login");
	 * chDriver.get("https://opensource-demo.orangehrmlive.com/");
	 * 
	 * 
	 * }
	 */

//	@Test(priority = 2)
//	public void validUsername() {
//		chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		chDriver.findElement(By.id("btnlogin")).click();
//
//	}

	@Test(priority = 1)
	public void invalidUsername() {
		chDriver.findElement(By.id("txtUsername")).sendKeys("Ad@min");
		chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		chDriver.findElement(By.id("btnLogin")).click();
		String actualMsg = chDriver.findElement(By.id("spanMessage")).getText();
		Assert.assertEquals(actualMsg, "Invalid credentials");
		

	}

	 

	/*
	 * @Test public void validPassword() {
	 * 
	 * 
	 * chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 * chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 * chDriver.findElement(By.id("btnlogin")).click();
	 * 
	 * }
	 * 
	 * @Test public void invalidPassword() {
	 * 
	 * 
	 * chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 * chDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	 * chDriver.findElement(By.id("btnlogin")).click();
	 * 
	 * }
	 * 
	 * 
	 * @Test public void lengthlessthenfive() {
	 * 
	 * 
	 * chDriver.findElement(By.id("txtUsername")).sendKeys("Admn");
	 * chDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	 * chDriver.findElement(By.id("btnlogin")).click();
	 * 
	 * }
	 * 
	 * 
	 * @Test public void lengthgreaterthenfive() {
	 * 
	 * 
	 * chDriver.findElement(By.id("txtUsername")).sendKeys("Admiin");
	 * chDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	 * chDriver.findElement(By.id("btnlogin")).click();
	 */

}
