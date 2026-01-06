package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Loginobjects;
import pageobjects.updatevalidation;

public class TC_update_validation extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		updatevalidation update = new updatevalidation(driver);
		
		update.applicationclick();
		update.distributeclick();
		Thread.sleep(3000);
		update.clickupdate();
		update.issuedd();
		update.prodd();
		
		boolean isClickable = update.applicatinfee();
		Assert.assertFalse(isClickable,"Application fee field is clickable, but it should NOT be clickable");

//		update.citydd();
//		update.selectcity();
		boolean isValid = update.validateRangeNotExceedApplicationCount("10");

		Assert.assertTrue(isValid,"Range field not accepted more than Application Count");
		//update.enterrange();
		update.clickfinalupdate();
		update.selectno();
		

}
}
