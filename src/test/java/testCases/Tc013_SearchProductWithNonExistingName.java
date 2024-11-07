package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;

public class Tc013_SearchProductWithNonExistingName extends Baseclass {

	@Test()
	public void searchProduct() {
		
		try {
		HomePage hp = new HomePage(driver);
		
		hp.txtSearchField("Honda");
		hp.clickSearchbtn();
		
		
		SearchPage sp = new SearchPage(driver);
		String invalidprdmsg = sp.getNonExistproductnamemsg();
        Assert.assertEquals(invalidprdmsg,"There is no product that matches the search criteria.");
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
}
