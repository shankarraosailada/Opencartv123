package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class Tc002_LoginTest extends Baseclass {

	@Test
	
	public void verify_Login() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("emailId"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage accpage = new MyAccountPage(driver);
		boolean targetpage = accpage.isMyAccountPageExistss();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e) 
		{
			Assert.fail();
		}
	}
	
	
	
}
