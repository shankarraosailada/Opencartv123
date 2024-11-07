package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class Tc0007_ConfirmPasswordFiledEmptyWarningMsg extends Baseclass {

	@Test()
	public void confirmPasswordFieldWarning() {
		
		try
		{
			
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage accpage = new AccountRegistrationPage(driver);
		accpage.setFirstName(randomstring());
		accpage.setLastName(randomstring());
		accpage.setTelephoneNumber(randomnumber());
		accpage.setEmail(randomstring()+"@gmail.com");
		accpage.setPassword(randomnumber());
		accpage.setPrivacyPolicy();
		accpage.clickContinue();
		
		
		Assert.assertEquals(accpage.getConfirmPasswordWarningMsg(),"Password confirmation does not match password!");
		}catch(Exception e)
		{
			Assert.fail();
		}
	}
}
