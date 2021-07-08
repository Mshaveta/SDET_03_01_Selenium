import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver chDriver = new ChromeDriver();// complex object
		chDriver.manage().window().maximize();
		//chDriver.get("https://en-gb.facebook.com/");
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
		chDriver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		chDriver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		chDriver.findElement(By.xpath("//form[contains(@action,'/index.php/auth/validateCredentials')]")).submit();
		
		

//		String fbHeading = chDriver
//				.findElement(
//						By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"))
//				.getText();
//		System.out.println(fbHeading);
//
//		String linkUrl = chDriver.findElement(By.linkText("Forgotten password?")).getAttribute("href");
//		System.out.println(linkUrl);
//		chDriver.navigate().to(linkUrl);
	}

}
