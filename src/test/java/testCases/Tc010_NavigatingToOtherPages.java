package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.ForgottenPassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Tc010_NavigatingToOtherPages extends Baseclass {

	@Test()
	public void navigationFromRegistrationPageToForgottenPasswordPage() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage accpage= new AccountRegistrationPage(driver);
		accpage.clickRegisterpageLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.clickforgottenpassword();
		
		ForgottenPassword fp = new ForgottenPassword(driver);
		fp.clickContinuebtn();
		
	  String wrngmsg = 	fp.getEmailWarningMsg();
	  Assert.assertEquals(wrngmsg,"Warning: The E-Mail Address was not found in our records, please try again!");
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
}
