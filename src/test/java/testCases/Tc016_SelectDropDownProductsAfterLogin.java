package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.SearchPage;

public class Tc016_SelectDropDownProductsAfterLogin extends Baseclass {

	@Test
	public void selectDropDownProducts() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("emailId"));
		Thread.sleep(2000);
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage accpage = new MyAccountPage(driver);
		accpage.txtsearchbox("mac");
		Thread.sleep(2000);
		accpage.clicksearchbutton();
		
		SearchPage sp = new SearchPage(driver);
		sp.dropdownallcategories();
		Thread.sleep(2000);
		sp.selectOptionByVisibleText("Desktops");
		sp.clickCheckboxinsubcategories();
		Thread.sleep(2000);
		sp.defaultdropdown();
		sp.clickSearchButton();
		Thread.sleep(2000);
		sp.selectoptionsfromdefaultdropdown("Price (High > Low)");
	     
	    sp.clickbtnlistview();	
	    Thread.sleep(2000);
		
		Assert.assertTrue(sp.productimac());
		
		
		
		
		
		
		
	}
}
