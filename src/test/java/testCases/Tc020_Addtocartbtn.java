package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class Tc020_Addtocartbtn extends Baseclass{

	@Test
	
	public void clickaddtocartbutton_inhomepage() {
		
		try {
		HomePage hp = new HomePage(driver);
		hp.clickaddtocartbtn();
		String defaultaddtocartmsg = hp.addtocartdefaultmsg();
		Assert.assertEquals(defaultaddtocartmsg,"Your shopping cart is empty!");
		}catch(Exception e) {
			Assert.fail();
		}
		
		
	}
	
	

}
