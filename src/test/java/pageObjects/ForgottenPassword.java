package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgottenPassword extends BasePage{

	WebDriver driver;
	public ForgottenPassword(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//input[@type='submit']") WebElement btncontinue;
	@FindBy(xpath = "//div[text()='Warning: The E-Mail Address was not found in our records, please try again!']")
	private WebElement emailwarningmsg;
	
	public void clickContinuebtn() {
		btncontinue.click();
	}
	
	public String getEmailWarningMsg() {
		String emailwrngmsg = emailwarningmsg.getText();
		return emailwrngmsg;
	}
}
