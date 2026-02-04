package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjects.Campus_Validations;
import pageobjects.Loginobjects;


public class TC_Branch7 extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		
		Campus_Validations version7 = new Campus_Validations(driver);
		
		
		//applicationclick
		if (version7.applicationclick()) {
		    Reporter.log("Application menu clicked successfully", true);
		} else {
		    Reporter.log("FAILED: Application menu was NOT clicked", true);
		}
		
		
		version7.distributeclick();
	    version7.campaigndistrictdd();
		version7.selectguntur();
		version7.citydd();
		version7.selectcity();
		version7.branchdd();
		version7.selectbranch();
		version7.issueddd();
		version7.selectissuedto();
		version7.appfeedd();
		version7.selectappfee();
		version7.seriesdd();
		version7.selectseries();
//		version7.enterrange();
		boolean istrue = version7.validateRangeNotExceedApplicationCount("1");

		Assert.assertTrue(istrue,"Range is not accepted more than available Application Count");
		
		version7.inserbtn();
		version7.selectno();
		//version7.selectyes();
		
	}


}
