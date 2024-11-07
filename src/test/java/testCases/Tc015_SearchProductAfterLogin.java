package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;

public class Tc015_SearchProductAfterLogin extends Baseclass {

	@Test()
	public void searchProductLogin() {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("emailId"));
		lp.setPassword("p.password");
		lp.clickLogin();
		
		hp.txtSearchField("mac");
		hp.clickSearchbtn();
		
		
		
		
	}
}
