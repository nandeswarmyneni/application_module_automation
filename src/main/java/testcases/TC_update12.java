package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjects.Loginobjects;
import pageobjects.Update12objects;

public class TC_update12 extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		
		Update12objects version12 = new Update12objects(driver);
		
		
		//applicationclick
		if (version12.applicationclick()) {
		    Reporter.log("Application menu clicked successfully", true);
		} else {
		    Reporter.log("FAILED: Application menu was NOT clicked", true);
		}
		
		
		version12.distributeclick();
		version12.clickupdate();
		version12.issuedd();
		version12.issuetosel();
		version12.clickapp();
		version12.seriessel();
//		version12.enterrange();
		boolean istrue = version12.validateRangeNotExceedApplicationCount("1");

		Assert.assertTrue(istrue,"Range is not accepted more than available Application Count");
		
		version12.updatebtn();
		version12.selectno();
		//version12.selectyes();
		
	


}
}
