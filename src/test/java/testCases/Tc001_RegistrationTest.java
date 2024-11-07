package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class Tc001_RegistrationTest extends Baseclass {
	
	@Test
	
	public void verify_Account_Registration() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		//regpage.setFirstName("shankar");
		regpage.setFirstName(randomstring().toUpperCase());
		//regpage.setLastName("s");
		regpage.setLastName(randomstring().toUpperCase());
		//regpage.setEmail("shankar12345678@gmail.com");
		regpage.setEmail(randomstring()+"@gmail.com");
		regpage.setPassword("12345");
		
		regpage.setConfirmPassword("12345");
		//regpage.setTelephoneNumber("78437032");
		regpage.setTelephoneNumber(randomnumber());
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		String confirmsg = regpage.getConfirmationmsg();
		
		Assert.assertEquals(confirmsg,"Your Account Has Been Created!");
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		
		
	}

	
	
}
