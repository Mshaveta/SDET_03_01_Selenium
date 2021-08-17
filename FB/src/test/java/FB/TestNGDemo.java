package FB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	WebDriver driver;
	
	@Test
	public void m1() {
		String bName = System.getProperty("browser"); 
		System.out.println(bName);
		if(bName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		
//		System.out.println("Title-"+ driver.getTitle());
//		 
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
		
	}
}
