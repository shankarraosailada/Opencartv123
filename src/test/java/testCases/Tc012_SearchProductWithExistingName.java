package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;

public class Tc012_SearchProductWithExistingName extends Baseclass{

	@Test
	public void SearchProduct() {
		try
		{
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.txtSearchField(p.getProperty("productname"));
		hp.clickSearchbtn();
		Thread.sleep(3000);
		SearchPage sp = new SearchPage(driver);
		String productmsg = sp.getSearchedProductmsg();
		Assert.assertEquals(productmsg,"HP LP3065");
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
}
