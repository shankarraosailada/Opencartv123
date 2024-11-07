package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	WebDriver driver;
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-email']") WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-password']") WebElement txtPassword;
	@FindBy(xpath = "//input[@type='submit']") WebElement btnLogin;
    @FindBy(xpath = "//div[text()='Warning: No match for E-Mail Address and/or Password.']")
    WebElement nomatchemailorpassword;
    @FindBy(xpath = "//a[@class='list-group-item'][text()='Forgotten Password']") WebElement forgottenpassword;
    @FindBy(xpath = "//div[text()='Warning: No match for E-Mail Address and/or Password.']") 
    WebElement clickLoginbtnwithoutcredentialswrngmsg;
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public String getNomatchWarningmessage() {
		String warningmsg = nomatchemailorpassword.getText();
		return warningmsg;
	}
	 
	public void clickforgottenpassword() {
		forgottenpassword.click();
	}

	public String clickbtnLoginwithoutcredentialswrngmsg() {
		String Loginwrngmsg = clickLoginbtnwithoutcredentialswrngmsg.getText();
		return Loginwrngmsg;
	}
	
}
