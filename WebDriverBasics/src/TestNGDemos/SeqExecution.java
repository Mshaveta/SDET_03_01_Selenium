package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeqExecution {
	WebDriver driver; // non static

	@Parameters("browser") // chrome
	@Test
	public void launch_browser_app(String browser_name) {
		System.out.println("Browser Name: - " + browser_name);
		if (browser_name.equalsIgnoreCase("chrome")) {
			String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();// complex object
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		} else if (browser_name.equalsIgnoreCase("firefox")) {
			String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();// complex object
			driver.manage().window().maximize();
			driver.get("https://facebook.com/");
		}

	}

	@Test(dependsOnMethods = "launch_browser_app")
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
}
