package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class Tc006_VerifyRegistrationWarningMsgs extends Baseclass {
	
	@Test()
	public void validate_Registration_Warning_Msgs() {
		
		try {
			
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		regpage.clickContinue();
		
		
		
	    String fnamewrngmsg = regpage.getFirstnameWarningMsg();
	    Assert.assertEquals(fnamewrngmsg,testdata.getProperty("firstnamewarningmsg"));
	  
		String lnamewrngmsg = regpage.getLastNameWarningMsg();
		Assert.assertEquals(lnamewrngmsg,testdata.getProperty("lastnamewarningmsg"));
		
		String emailwrngmsg = regpage.getEmailWarningMsg();
		Assert.assertEquals(emailwrngmsg,testdata.getProperty("emailwarningmsg"));
		
	   String telewrngmsg =	regpage.getTelephoneWarningMsg();	
	   Assert.assertEquals(telewrngmsg,testdata.getProperty("telephonewarningmsg"));
	   
       String passwrngmsg = regpage.getPasswordWarningMsg();
  	   Assert.assertEquals(passwrngmsg, testdata.getProperty("passwordwarningmsg"));
  	   
  	  String privacywrngmsg =  regpage.getPrivacyPolicyWarningmsg();
  	  Assert.assertEquals(privacywrngmsg,testdata.getProperty("privacypolicywarningmsg"));
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	

}
