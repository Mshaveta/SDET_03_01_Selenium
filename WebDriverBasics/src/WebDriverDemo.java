import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		//Browser Launch
		//Step1: get the driver path
		String driverPath = System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe";
		////D:\2021\Batches_DATA\SDET_0301\LearnSelenium_03_01\WebDriverBasics
		//System.out.println("path - "+ driverPath);
		//D:\2021\Batches_DATA\SDET_0301\LearnSelenium_03_01\WebDriverBasics\src\drivers\chromedriver.exe
		//D:\2021\Batches_DATA\SDET_0301\LearnSelenium_03_01\WebDriverBasics
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver chDriver = new ChromeDriver();//complex object
		//maximize
		chDriver.manage().window().maximize();
		
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Webdriver -Interface, driver - ref var, CHromeDriver-class
		
		
		//Firefox Browser:
//		String ffDriverPath = System.getProperty("user.dir")+"\\src\\drivers\\geckodriver.exe";
//		System.setProperty("webdriver.gecko.driver", ffDriverPath);
//		WebDriver ffDriver = new FirefoxDriver();//complex object
		
		//get the current Url, title of application
		
		//chDriver.close();
		

	}

}
