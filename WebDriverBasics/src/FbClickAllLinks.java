import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbClickAllLinks {

	public static void main(String[] args) throws Exception {
		/// div[@id='pageFooterChildren']/ul/li/a
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver chDriver = new ChromeDriver();// complex object
		chDriver.manage().window().maximize();
		chDriver.get("https://en-gb.facebook.com/");
		
		List<WebElement> aElmns = chDriver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a"));
		Iterator<WebElement> itr = aElmns.iterator();
		while(itr.hasNext()) {
			WebElement anchorElm = itr.next();
			String linkText = anchorElm.getText();
			System.out.println(linkText);
		}
 
		
		
//		int count = chDriver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a")).size(); 
//		for(int i=1;i<=count;i++) {
//			////div[@id='pageFooterChildren']/ul/li[1]/a"
//			String linkText =  chDriver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li/a")).get(i).getText();
//			//or 
//			//String linkText =  chDriver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul/li["+i+"]/a")).getText();
//			String linkUrl =  chDriver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul/li["+i+"]/a")).getAttribute("href");
//			//System.out.println(linkText+" - "+linkUrl);
//			chDriver.navigate().to(linkUrl);
//			//Thread.sleep(2000);
//			chDriver.navigate().back();
//			//Thread.sleep(2000);
//			
//		}
		
	}

}
