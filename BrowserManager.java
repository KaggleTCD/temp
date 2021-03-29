package temp.product.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserManager {
	
	
	public static WebDriver getDriver(String browserName,String url) {
		
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log("Url launched",true);
		return driver;
	}

}
