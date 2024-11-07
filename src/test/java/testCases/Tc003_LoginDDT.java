package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

public class Tc003_LoginDDT extends Baseclass {

	
		
		@Test(dataProvider = "LoginData",dataProviderClass=DataProviders.class)
		public void verify_loginData(String emailid,String pwd,String exp) {
			
			try {

			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
			
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(emailid);
			lp.setPassword(pwd);
			Thread.sleep(3000);
			lp.clickLogin();;
			
			MyAccountPage acc = new MyAccountPage(driver);
			boolean targetpage = acc.isMyAccountPageExistss();
			
			//Data is valid   --login sucess  -- testpass  --logout
	        //Data is valid		login fail     --test fail
			//Data is invalid   loginsucess    --test fail  --logout
			//Data is invalid    loginfail     -- test pass 
			
			if(exp.equalsIgnoreCase("valid"))
			{
				if(targetpage == true) 
				{
					acc.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			if(exp.equalsIgnoreCase("invalid"))
			{
				if(targetpage == true)
				{
					acc.clickLogout();
					Assert.assertTrue(false);
				}
				else 
				{
					Assert.assertTrue(true);
				}
			}
			
			}
			catch(Exception e)
			{
				Assert.fail();
			}
	}
}
