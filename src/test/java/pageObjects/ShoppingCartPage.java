package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver){
		super(driver);
	}
	
	
	@FindBy(xpath = "//a[.='Checkout'][@class='btn btn-primary']") WebElement checkoutbtn;
	@FindBy(xpath = "//button[@data-original-title='Remove']") WebElement clickremoveicon;
	@FindBy(xpath = "//a[.='Continue']") WebElement clickcontinuebtn;
	@FindBy(xpath = "//a[.='Qafox.com']") WebElement homepage;
	public void clickCheckOutBtn() {
		checkoutbtn.click();
	}
	
	public void clickRemoveIcon() {
		clickremoveicon.click();
	}
	
	public void clickContinueBtn() {
		clickcontinuebtn.click();
	}
	
	public boolean homePageIsDisplayed() {
		boolean homepagetitle = homepage.isDisplayed();
		return homepagetitle;
	}
	
}
