package FB.Eventhandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotCapture {
	WebDriver driver;

	Actions action;

	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		action = new Actions(driver);

	}

	@Test
	public void captureScreenShot() throws IOException {
		WebElement iFrameArea = driver.findElement(By.xpath("//iframe[contains(@src,'demos/droppable')]"));
		
		//Main Window
		driver.switchTo().frame(0);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target);
		//to comeout from the iframe
		driver.switchTo().defaultContent();
		
		//take screenshot
		File srcFilePath = iFrameArea.getScreenshotAs(OutputType.FILE);
		//create file 
		File targetPath = new File("./screenshots/iFrame.png");
		
		//movr the file into folder
		FileUtils.copyFile(srcFilePath, targetPath);
		 
	}
}
