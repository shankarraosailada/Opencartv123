package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MonitorsPage extends BasePage {

	public MonitorsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//select[@id='input-sort']")WebElement sortbydropdownbtn;
    @FindBy(xpath = "//i[@class='fa fa-th-list']") WebElement listbtn;
    @FindBy(xpath = "//a[.='Apple Cinema 30\"']") WebElement monitorApple;
    @FindBy(xpath = "//h4/a[.='Samsung SyncMaster 941BW']") WebElement addSamsungMonitorToCartBtn;
    @FindBy(xpath= "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]") WebElement addAppleMonitorToCartbtn;
    @FindBy(xpath = "//span[@id='cart-total']") WebElement cartBagBtn;
    @FindBy(xpath= "(//div[contains(text(),' Success: You have added')])") WebElement itemaddedtocartmsg;
    @FindBy(xpath = "//a/strong[text()='View Cart']") WebElement viewcartbtn;
    @FindBy(xpath = "//span[@id='cart-total']") WebElement cartbag;
	public void sortbyDropDown() {
		sortbydropdownbtn.click();
	}
	
	public void selectFromSortbyDropDown(String name) {
		Select options = new Select(sortbydropdownbtn);
		options.selectByVisibleText(name);
	}
	
	public void clickListBtn() {
		listbtn.click();
	}
	
	public boolean monitorAppleisdisplayed() {
		boolean appleMonitor = monitorApple.isDisplayed();
		return appleMonitor;
	}
	
	public void addSamsungToCartBtn() {
		addSamsungMonitorToCartBtn.click();
	}
	
	public void addAppleMonitorToAddToCartBtn() {
		addAppleMonitorToCartbtn.click();
	}
	
	public boolean getItemAddedToCartmsgIsDisplayed() {
		 boolean itemadded = itemaddedtocartmsg.isDisplayed();
		 return itemadded;
	}
		
	public void viewCartBtn() {
		viewcartbtn.click();
	}
	
	public void clickCartBag() {
		cartbag.click();
	}
		 
	}
	
	
	

