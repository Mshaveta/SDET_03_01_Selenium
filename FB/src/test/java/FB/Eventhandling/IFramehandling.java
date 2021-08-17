package FB.Eventhandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFramehandling {
	WebDriver driver;

	@Test
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("file:///G:/API_TESTING/study_material/template_7/iFrames.html");
		//main window element
		
//		String pageHeading = driver.findElement(By.xpath("//h1[text()='iFrames Handling']")).getText();
//		System.out.println(pageHeading);
//		
//		
//		//Switch to iframe
		WebElement elm = driver.findElement(By.xpath("//iframe[contains(@src,'iFrame_data')]"));
		driver.switchTo().frame(elm);
		driver.findElement(By.id("name")).sendKeys("AdminUser");
//		
//		//to comeout from the iframe
//		driver.switchTo().defaultContent();
		
		//Alert Handling Heading
		//locATE IFRAME by WebElment
		
		//driver.switchTo().frame(elm);
		
		//driver.switchTo().frame("iframebasic2");
//		String alertHandle = driver.findElement(By.xpath("//h1[text()='Alerts Handling']")).getText();
//		System.out.println(alertHandle);
		
		//driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		
		
//		driver.switchTo().defaultContent();
//		String copyrtMsg = driver.findElement(By.xpath("//p[contains(text(),'Copyright 2017')]")).getText();
//		System.out.println(copyrtMsg);
		
		
	}

}
