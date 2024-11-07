package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LapTopsAndNoteBookpage extends BasePage {
	
	 public LapTopsAndNoteBookpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//ul[@class='breadcrumb']") WebElement breadcrumb;
	
	
	public void lapTopsAndNoteBooks() {
		
	}

}
