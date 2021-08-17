package FB.Eventhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {
	WebDriver driver;
	WebDriverWait wait ;
	Actions action ;
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("G:/API_TESTING/study_material/template_7/nested_menus.html");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		action = new Actions(driver);
		 
	}

	@Test(enabled=false)
	public void mouseMovement() throws InterruptedException {
		WebElement projs_item1 = driver.findElement(By.xpath("//a[contains(text(),'Projects')]"));	
		WebElement ex_item2 = driver.findElement(By.xpath("//a[contains(text(),'Exercise2')]"));
		WebElement alert_item3 = driver.findElement(By.xpath("//a[text()='Alerts Handling']"));
		
		
		action.moveToElement(projs_item1).build().perform();
		Thread.sleep(2000);
		action.moveToElement(ex_item2).build().perform();
		Thread.sleep(2000);
		alert_item3.click();
	
	}
	
	@Test
	public void dragAndDrop() {
		//Switch to iFrame
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, target).perform();
		
		//to cvomeout from the frame
		driver.switchTo().defaultContent();
		//Heading - of main webpage
		String headingTxt  = driver.findElement(By.xpath("//h1[text()='Droppable']")).getText();
		System.out.println("Heading...."+headingTxt);
		
		 
	}
	
	
	
	 
	
	 
}
