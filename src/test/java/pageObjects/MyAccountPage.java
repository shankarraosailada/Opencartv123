package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	Actions action;
	WebDriver driver;
	public MyAccountPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//h2[text()='My Account']")WebElement confirmationmsg;
	@FindBy(xpath = "//a[@class='list-group-item'][text()='Logout']") WebElement logout;
	@FindBy(xpath = "//input[@type='text']") WebElement txtsearchbox;
	@FindBy(xpath = "//button[@type='button']/parent::span") WebElement searchbtn;
	@FindBy(xpath= "//a[.='Components']") WebElement componentbtn;
	@FindBy(xpath = "//a[.='Monitors (2)']")WebElement Monitorsbtn;
    @FindBy(xpath = "//a[.='Phones & PDAs']")WebElement phonesandPDAs;
    @FindBy(xpath ="//a[contains(text(),'Laptops & Notebooks')][@class='dropdown-toggle']") WebElement laptopsandnotebooks;
    @FindBy(xpath = "//a[.='Show AllLaptops & Notebooks']")WebElement showalllaptopsandnotebooks;
    @FindBy(xpath = "//a[.='Desktops']") WebElement Desktopbtn;
    
	public boolean isMyAccountPageExistss() {
		try {
			return(confirmationmsg.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public void txtsearchbox(String name) {
		txtsearchbox.sendKeys(name);
	}
	public void clicksearchbutton() {
		searchbtn.click();
	}
	
	public void componentbtn() {
		componentbtn.click();
	}
	
	public void clickMonitorsbtn() {
		Monitorsbtn.click();
	}
	
	public void phonesandpdas() {
		phonesandPDAs.click();
	}
	
	public void laptopsAndNoteBooks() {
		 action = new Actions(driver);
		Action lptopandnotebooks = action.moveToElement(laptopsandnotebooks).build();	
	}
	
	public void showAllLaptopsAndNoteBooks() {
		showalllaptopsandnotebooks.click();
	}
	public void navigateBackToMyAccount() {
		driver.navigate().back();
	}
	
	public void moveToDesktopbtnClickMac() {
		 action = new Actions(driver);
		action.moveToElement(Desktopbtn).click().build().perform();
		
	}

}
