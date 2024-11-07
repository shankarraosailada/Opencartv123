package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;


	
	public class Tc008_VerifyvalidemailpasswordsDDT extends Baseclass
	
	{
		@Test(dataProvider = "ValidEmailPassword",dataProviderClass = DataProviders.class)
		public void validEmailPasswords(String email,String pwd) {
			try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLogin();
			
			MyAccountPage accpage = new MyAccountPage(driver);
			boolean targetpage = accpage.isMyAccountPageExistss();
			
			if(targetpage==true) {
				accpage.clickLogout();
				Assert.assertTrue(true);
				
			}
			else {
				Assert.assertTrue(false);
			}
			}
			catch(Exception e) {
				Assert.fail();
			}
		
			}
}
