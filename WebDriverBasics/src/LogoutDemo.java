import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutDemo {
	public static void main(String[] args) 
	{
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver chDriver = new ChromeDriver();// complex object
		chDriver.manage().window().maximize();
		chDriver.get("https://opensource-demo.orangehrmlive.com/");
		chDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		chDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		chDriver.findElement(By.id("btnLogin")).click();

		// welcome click
		//chDriver.findElement(By.id("welcome")).click();
		chDriver.findElement(By.linkText("Welcome xyz")).click();

	}
}
