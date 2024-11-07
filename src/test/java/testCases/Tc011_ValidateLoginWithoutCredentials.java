package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Tc011_ValidateLoginWithoutCredentials extends Baseclass{

	@Test()
	
	public void verifyLoginAccountWithoutCredentials() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.clickLogin();
		String wrngmsg = lp.clickbtnLoginwithoutcredentialswrngmsg();
		Assert.assertEquals(wrngmsg, "Warning: No match for E-Mail Address and/or Password.");
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		
	    
		
	}
	
}
