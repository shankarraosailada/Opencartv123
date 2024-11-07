package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class Tc019_NavigatingToVariousDropDownsAndLinks extends Baseclass {
	
	@Test()
	public void navigatingToDifferentLinks() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("emailId"));
		Thread.sleep(2000);
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage accpage = new MyAccountPage(driver);
		Thread.sleep(2000);
		accpage.laptopsAndNoteBooks();
		Thread.sleep(2000);
		accpage.showAllLaptopsAndNoteBooks();
		accpage.navigateBackToMyAccount();
		Thread.sleep(2000);
		boolean accpagehome = accpage.isMyAccountPageExistss();
		Assert.assertTrue(accpagehome);
		
		
		
	}

}
