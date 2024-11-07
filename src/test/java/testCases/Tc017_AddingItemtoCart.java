package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MonitorsPage;
import pageObjects.MyAccountPage;
import pageObjects.ShoppingCartPage;

public class Tc017_AddingItemtoCart extends Baseclass{

	@Test()
	public void addingItemToCartAndRemove() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("emailId"));
		lp.setPassword(p.getProperty("password"));
		Thread.sleep(2000);
		lp.clickLogin();
		
		Thread.sleep(2000);
		MyAccountPage accpage = new MyAccountPage(driver);
		accpage.componentbtn();
		Thread.sleep(2000);
		accpage.clickMonitorsbtn();
		
		Thread.sleep(2000);
		MonitorsPage mp = new MonitorsPage(driver);
		mp.addSamsungToCartBtn();
		mp.sortbyDropDown();
		Thread.sleep(2000);
		mp.selectFromSortbyDropDown("Price(High>low)");
		mp.clickCartBag();
		Thread.sleep(2000);
		mp.viewCartBtn();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.clickRemoveIcon();
		Thread.sleep(2000);
		sp.clickCheckOutBtn();
		Thread.sleep(2000);
		boolean homepage = sp.homePageIsDisplayed();
		Assert.assertTrue(homepage);

	}
}
