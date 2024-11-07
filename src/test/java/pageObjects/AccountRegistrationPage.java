package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage  extends BasePage {
	
	
	public AccountRegistrationPage(WebDriver driver){
		super(driver);
	}
	
    @FindBy(xpath = "//input[@id='input-firstname']") WebElement txtFirstName;
    @FindBy(xpath = "//input[@id='input-lastname']") WebElement txtLastName;
    @FindBy(xpath = "//input[@id='input-email']") WebElement txtEmail;
    @FindBy(xpath = "//input[@id='input-telephone']") WebElement txtTelephone;
    @FindBy(xpath = "//input[@id='input-password']") WebElement txtPassword;
    @FindBy(xpath = "//input[@id='input-confirm']") WebElement txtConfirmPassword;
    @FindBy(xpath = "//input[@name='agree']") WebElement chkdPolicy;
    @FindBy(xpath = "//input[@value='Continue']") WebElement btnContinue;
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")WebElement confirmationmsg;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible'][text()='Warning: E-Mail Address is already registered!']") 
	WebElement registrationWarning;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible'][text()='Warning: You must agree to the Privacy Policy!']")
	WebElement privacyPolicyWarning;
	
	@FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']") WebElement firstnamewarningmsg;
	@FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")WebElement lastnamewarningmsg;
	@FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")WebElement emailwarningmsg;
	@FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")WebElement telephonewarningmsg;
	@FindBy(xpath = "//div[text()='Password must be between 4 and 20 characters!']")WebElement passwordwarningmsg;

	//registering an account by not giving confirm password field
	
	@FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
	WebElement confirmpasswordwarningmsg;
	
	@FindBy(xpath = "//a[@class='list-group-item'][text()='Login']") WebElement registerpageLoginlink;
	
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelephoneNumber(String phonenumber) {
		txtTelephone.sendKeys(phonenumber);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy() {
		chkdPolicy.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue );
		
	}
	
	public String getConfirmationmsg() {
		try {
			return (confirmationmsg.getText());    //this method will return the captured confirmation message ,if the message
			                                       //is not displayed it will shown an error ,
			                        //we will compare with the confirm message and do validation  so place it in try catch block
			                                        //and catch the exception and return the exception message .
		}
		catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	
	public String getWarningmsg() {
		try {
			return (registrationWarning.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public String getPrivacyPolicyWarningmsg() {
		try {
		return	privacyPolicyWarning.getText();
		}
		catch(Exception e) 
		{
		return (e.getMessage());	
		}
	}
	
	public String getFirstnameWarningMsg() {

		try {
	 String fnamewrngmsg = firstnamewarningmsg.getText();
	return fnamewrngmsg;
		}catch(Exception e) 
		{
			return(e.getMessage());
		}
	}
	
	public String getLastNameWarningMsg() {
		try {
		String lnamewrngmsg = lastnamewarningmsg.getText();
		return lnamewrngmsg;
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	public String getTelephoneWarningMsg() {
		try
		{
		String telewarningmsg = telephonewarningmsg.getText();
		return telewarningmsg;
		}
		catch(Exception e) 
		{
			return (e.getMessage());
		}
	}
	
	public String getPasswordWarningMsg() 
	{
		try
		{
		String passwrngmsg = passwordwarningmsg.getText();
		return passwrngmsg;
		}catch(Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	public String getEmailWarningMsg() {
		try 
		{
    String emailwrngmsg = emailwarningmsg.getText();
    return emailwrngmsg;
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
	public String getConfirmPasswordWarningMsg()
	{
	String confirmpasswordwrngmsg = confirmpasswordwarningmsg.getText();
	return confirmpasswordwrngmsg;
	}
	
	public void clickRegisterpageLogin() {
		registerpageLoginlink.click();
	}
	
	
}
