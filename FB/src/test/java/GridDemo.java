import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo {
	@Parameters("browser")
	@Test
	public void setUp(String browser) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();

		if (browser.equals("chrome")) {
			cap.setCapability("platform", Platform.ANY);
			cap.setBrowserName("chrome");
		} else if (browser.equals("firefox")) {
			cap.setCapability("platform", Platform.ANY);
			cap.setBrowserName("firefox");
		}
		URL url = new URL("http://localhost:5555/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}
