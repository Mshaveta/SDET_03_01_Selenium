import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverDemoUsingMethods {
	static WebDriver chDriver;//global

	public static void launchBrowser() {
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		chDriver = new ChromeDriver();// complex object
		chDriver.manage().window().maximize();
		chDriver.get("file:///D:/2021/Batches_DATA/SDET_0301/LearnSelenium_03_01/SDET_03_01_Selenium/template_7/locate_html_elements.html"); 	
	}

	public static void htmlForm() throws InterruptedException {
		chDriver.findElements(By.name("user_age")).get(1).click();
		// Dropdown: <select>
		WebElement jobElm = chDriver.findElement(By.id("job"));
		Select job_drop_dwn = new Select(jobElm);
		// By Index
		job_drop_dwn.selectByIndex(5);
		Thread.sleep(2000);
		// by value
		job_drop_dwn.selectByValue("php_developor");
		Thread.sleep(2000);
		// by visible text
		job_drop_dwn.selectByVisibleText("Mobile Designer");
	}

	public static void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		chDriver.close();
	}

	
}
