package FB.Eventhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	WebDriver driver;
	WebDriverWait wait ;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/alerts");
		driver.manage().window().maximize();
		//implicit wait
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		 
		 //single elment
		 wait = new WebDriverWait(driver, 30);
	}

	@Test(enabled=false)
	public void alertBox() throws InterruptedException {
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(5000);//Explicitly Wait - static wait
		Alert alt = driver.switchTo().alert();
		String alertBoxTxt = alt.getText();
		System.out.println("Msg - "+alertBoxTxt);
		alt.accept();
		
		//Ok -  accept()
		//cancel - dismiss()
		//text - getText()
		//textField -  sendKeys();//Firefox
		
	}
	
	@Test(enabled=false)
	public void alertBoxAfterWait() throws InterruptedException {
		driver.findElement(By.id("timerAlertButton")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		String alertBoxTxt = alt.getText();
		System.out.println("Msg - "+alertBoxTxt);
		alt.accept();
	}
	
	@Test
	public void confirmBox() throws InterruptedException {
		driver.findElement(By.id("confirmButton")).click();
		Alert alt = driver.switchTo().alert();
		String alertBoxTxt = alt.getText();
		System.out.println("Msg - "+alertBoxTxt);
		alt.dismiss();
	}
	
	@Test
	public void promptBox() throws InterruptedException {
		
		driver.findElement(By.id("promtButton")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("tester Name");

		Thread.sleep(5000);
		 
		alt.accept();
	}
	
	
	
//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(10000);
//		driver.close();
//		
//	}
}
