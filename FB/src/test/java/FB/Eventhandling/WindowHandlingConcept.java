package FB.Eventhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingConcept {
	WebDriver driver;

	@Test
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.twitter.com/");
	}

//	@Test
//	public void getAllWindows() {
//		// parent window
//		String parentWindow = driver.getWindowHandle();
//		System.out.println("Parent Window - " + parentWindow);//1
//		
//		System.out.println("Title of Parent Window - "+driver.getTitle());
//
//		// for all the windows
//		Set<String> allWindows = driver.getWindowHandles();//Parent + child-2
//		System.out.println(allWindows);
//		Iterator<String> itr = allWindows.iterator();
//		while(itr.hasNext()) {
//			String childWindow = itr.next();
//			driver.switchTo().window(childWindow);
//			System.out.println("Title of Child  Window - "+ driver.getTitle());
//			
//		}
	//}
}
