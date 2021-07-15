package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
	WebDriver chDriver;
	@Test
	public void claunch_browser_app() {
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver chDriver = new ChromeDriver();// complex object
		chDriver.manage().window().maximize();
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(dependsOnMethods="claunch_browser_app")
	public void alogin() {
		chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		chDriver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(dependsOnMethods="alogin")
	public void blogOut() {
		chDriver.findElement(By.id("welcome")).click();
	}
}
