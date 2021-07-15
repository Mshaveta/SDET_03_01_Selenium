package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prioritization {
	WebDriver chDriver;
	@Test(priority=1)
	public void app_browser_launch() {
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		chDriver = new ChromeDriver();// complex object
		chDriver.manage().window().maximize();
		chDriver.get("https://en-gb.facebook.com/");
	}
	
	@Test(priority=2)
	public void verifyUrl() {
		 String expectedUrl = "https://en-gb.facebook.com/";
		 String actualUrl = chDriver.getCurrentUrl();
		 if(expectedUrl.equals(actualUrl)) {
			 System.out.println("Matched!");
		 }else {
			 System.out.println("Not Matched !");
		 }
	}
	@Test(priority=3)
	public void verifyTitle() {
		 String expectedTtl = "facebook";
		 String actualTtl = chDriver.getTitle();
		 if(expectedTtl.equals(actualTtl)) {
			 System.out.println("Matched!");
		 }else {
			 System.out.println("Not Matched !");
		 }
	}
//	@Test(priority=4)
//	public void bm1() {
//		System.out.println("bm1 method.....");
//	}
//	@Test(priority=5)
//	public void dm1() {
//		System.out.println("dm1 method.....");
//	}
	
//	@Test 
//	public void aam1() {
//		System.out.println("aam1 method.....");
//	}
//	
//	@Test 
//	public void bbm1() {
//		System.out.println("bbm1 method.....");
//	}
}
