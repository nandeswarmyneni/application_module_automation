package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjects.Campus_Validations;
import pageobjects.Loginobjects;


public class TC_Campus_Validations extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		
		Campus_Validations version3 = new Campus_Validations(driver);
		
		
		//applicationclick
		if (version3.applicationclick()) {
		    Reporter.log("Application menu clicked successfully", true);
		} else {
		    Reporter.log("FAILED: Application menu was NOT clicked", true);
		}
		
		
		version3.distributeclick();
		version3.campaigndistrictdd();
		version3.selectguntur();
		version3.citydd();
		version3.selectcity();
		version3.branchdd();
		version3.selectbranch();
		version3.issueddd();
		version3.selectissuedto();
		version3.appfeedd();
		version3.selectappfee();
		version3.seriesdd();
		version3.selectseries();
//		version3.enterrange();
		boolean istrue = version3.validateRangeNotExceedApplicationCount("1");

		Assert.assertTrue(istrue,"Range is not accepted more than available Application Count");
		
		version3.inserbtn();
		version3.selectno();
		//version3.selectyes();
		
	}


}
