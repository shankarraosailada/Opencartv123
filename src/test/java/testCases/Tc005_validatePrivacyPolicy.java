package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class Tc005_validatePrivacyPolicy extends Baseclass {

	@Test()
	public void validate_Privacy_Policy_box() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName(randomstring());
		regpage.setLastName(randomstring());
		regpage.setEmail(alphanumeric()+"@gmail.com");
		regpage.setPassword("12345");
		regpage.setConfirmPassword("12345");
		regpage.setTelephoneNumber(randomnumber());
		regpage.clickContinue();
		
		String warningmsgPrivacyPolicy = regpage.getPrivacyPolicyWarningmsg();
		Assert.assertEquals(warningmsgPrivacyPolicy,"Warning: You must agree to the Privacy Policy!");
		
		}catch(Exception e) {
			Assert.fail();
		}
		
		
	}
	
}
