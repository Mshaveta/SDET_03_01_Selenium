import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver chDriver = new ChromeDriver();// complex object
		chDriver.manage().window().maximize();
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
		chDriver.navigate().to("https://www.facebook.com/");
//		chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		chDriver.findElement(By.id("btnLogin")).click();
		
		//name locator:
		//chDriver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//Thread.sleep(5000);
		//to clear the field:
		//chDriver.findElement(By.id("txtUsername")).clear();
		
//		//tagName Locator:
		//List<WebElement> list =  chDriver.findElements(By.tagName("input"));
		
//		int count =  chDriver.findElements(By.tagName("input")).size();
//		System.out.println(count);
		
		//className Locator:
		//chDriver.findElement(By.className("button")).click();
		
		//linkText Locator:
		chDriver.findElement(By.linkText("Forgot your password?")).click();
		
		//clikc on browser's back button
		chDriver.navigate().back();
		
		//partialLinkText Locator:
		chDriver.findElement(By.partialLinkText("Forgot your password")).click();
		
		
		Thread.sleep(5000);
		chDriver.close();
		
		
		
		
		
		
	}

}
