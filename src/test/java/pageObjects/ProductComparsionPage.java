package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparsionPage extends BasePage {

	public ProductComparsionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h1[.='Product Comparison']") WebElement productcomparsionpagetitle;
	
	
	
	public boolean productComparsionPage() {
		boolean productcompare = productcomparsionpagetitle.isDisplayed();
		return productcompare;
	}
}
