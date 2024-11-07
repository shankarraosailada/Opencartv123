package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;

public class Tc014_SearchWithNoProduct extends Baseclass {

	@Test
	public void noproduct() {
		try {
		HomePage hp = new HomePage(driver);
		hp.clickSearchbtn();
		
		SearchPage sp = new SearchPage(driver);
		String wrngmsg = sp.getNoProductWrngmsg();
		Assert.assertEquals(wrngmsg,"There is no product that matches the search criteria.");
		}catch(Exception e) {
			Assert.fail();
		}
	}
}
