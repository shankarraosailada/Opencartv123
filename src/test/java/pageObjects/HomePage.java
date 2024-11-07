package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath ="//span[normalize-space()='My Account']") WebElement lnkMyaccount;
	@FindBy(xpath ="//a[normalize-space()='Register']") WebElement lnkRegister;
	@FindBy(xpath ="//a[normalize-space()='Login']") WebElement lnkLogin;
	@FindBy(xpath = "//input[@placeholder='Search']") WebElement txtSearchField;
	@FindBy(xpath = "//button[@type='button']/parent::span[@class='input-group-btn']") WebElement btnSearch;
	@FindBy(xpath = "(//div//button[@data-toggle='dropdown'])[2]") WebElement addtocartbtn;
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")WebElement defaultaddtocartmsgtxt;
	
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
		}
	
	public void txtSearchField(String productname) {
		txtSearchField.sendKeys(productname);
	}
	
	public void clickSearchbtn() {
		btnSearch.click();
	}
	
	public void clickaddtocartbtn() {
		addtocartbtn.click();
		}
			
	public String addtocartdefaultmsg() {
		String defaultmsg = defaultaddtocartmsgtxt.getText();
		return defaultmsg;
	}
  
}
