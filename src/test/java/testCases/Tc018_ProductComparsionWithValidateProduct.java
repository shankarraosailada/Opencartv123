package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.ProductComparsionPage;
import pageObjects.SearchPage;


public class Tc018_ProductComparsionWithValidateProduct extends Baseclass {
	
		
     @Test()
	public void productComparsion() 
	{
		try {
	HomePage hp = new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
   
	LoginPage lp = new LoginPage(driver);
	lp.setEmail(p.getProperty("emailId"));
	lp.setPassword(p.getProperty("password"));
	lp.clickLogin();
	
	MyAccountPage accpage = new MyAccountPage(driver);
	accpage.txtsearchbox("mac");
	Thread.sleep(2000);
	accpage.clicksearchbutton();
	
	SearchPage sp = new SearchPage(driver);
	 sp.productCompareBtnImac();
	 Thread.sleep(2000);
	 sp.productCompareBtnMacBook();
	 sp.productComparsionLink();
	 Thread.sleep(2000);
	 ProductComparsionPage pc = new ProductComparsionPage(driver);
	 boolean productcomparsion = pc.productComparsionPage();
	 
	 Assert.assertTrue(productcomparsion);
	}
	catch(Exception e) {
		Assert.fail();
	}
	}
	}

