package temp.product.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class PO_Search {
	
	WebDriver driver;

	public PO_Search(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.NAME,using="hint_q")
	private WebElement textBoxSearch;
	@FindBy(how=How.CLASS_NAME,using="ty-icon-search")
	private WebElement searchButton;
	
	public void setSearchTextBox(String arg) {
		
		textBoxSearch.sendKeys(arg);
		Reporter.log("Product entered in the box"+arg,true);
	}
	
	public void clickSearchButton() {
		
		searchButton.click();
		Reporter.log("Searched button clicked",true);
	}
	
	public void searchAProduct(String arg) {
		
		setSearchTextBox(arg);
		clickSearchButton();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Search results");
		Reporter.log("Product searched successfully",true);
	}

}
