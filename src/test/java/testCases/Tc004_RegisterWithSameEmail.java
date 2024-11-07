package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class Tc004_RegisterWithSameEmail extends Baseclass {

	@Test()
	public void verify_Register_with_Existing_Email() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		 regpage.setFirstName(randomstring());
		 regpage.setLastName(randomstring());
		 regpage.setEmail(p.getProperty("emailId"));
		 regpage.setPassword(p.getProperty("password"));
		 regpage.setConfirmPassword(p.getProperty("password"));
		 regpage.setTelephoneNumber(randomnumber());
		 regpage.setPrivacyPolicy();
		 regpage.clickContinue();
		String warningtext =  regpage.getWarningmsg();
		Assert.assertEquals(warningtext,"Warning: E-Mail Address is already registered!");
		}catch(Exception e) {
			Assert.fail();
		}
  		 
	}
}
