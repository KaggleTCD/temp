package temp.product.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import temp.product.po.PO_Search;
import temp.product.util.BrowserManager;

/**
 * @author phipartners
 *This class is a proof of concept.
 *First let me check if it works or not.
 *Then I can go ahead and make the project.
 */
public class TC_HealthCheck {
	
	//String url = "https://demo.cs-cart.com/stores/bae3331ccdf961bd/";
	
	/**
	 * Search a url
	 */
	@Test
	@Parameters({"browser","url"})
	public void testCartSearch(String browser,String url) {
		
		WebDriver driver = BrowserManager.getDriver(browser,url);
		//driver.findElement(By.name("hint_q")).sendKeys("computer");
		//driver.findElement(By.className("ty-icon-search")).click();
		PO_Search obj = PageFactory.initElements(driver, PO_Search.class);
		obj.searchAProduct("computer");
	}

}
