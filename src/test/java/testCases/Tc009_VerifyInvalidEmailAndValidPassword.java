package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Tc009_VerifyInvalidEmailAndValidPassword  extends Baseclass{

	@Test()
	public void verify_InvalidEmail_ValidPassword() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("shankar@gmail.com");
		lp.setPassword("12345");
		lp.clickLogin();
		
		String warningmsg = lp.getNomatchWarningmessage();
		
		Assert.assertEquals(warningmsg,testdata.getProperty("invalidemailwarningmsg"));
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
}
