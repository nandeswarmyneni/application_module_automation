package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjects.Branch12objects;
import pageobjects.Loginobjects;


public class TC_Branch12 extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		
		Branch12objects version12 = new Branch12objects(driver);
		
		
		//applicationclick
		if (version12.applicationclick()) {
		    Reporter.log("Application menu clicked successfully", true);
		} else {
		    Reporter.log("FAILED: Application menu was NOT clicked", true);
		}
		
		
		version12.distributeclick();
		version12.branchnamedd();
		version12.branchselect();
		version12.issuedtodd();
		version12.selectissuename();
		version12.appfeedd();
		version12.appfesel();
		version12.appsesdd();
		version12.seriessel();
//		version12.enterrange();
		boolean istrue = version12.validateRangeNotExceedApplicationCount("1");

		Assert.assertTrue(istrue,"Range is not accepted more than available Application Count");
		
		version12.inserbtn();
		version12.selectno();
		//version12.selectyes();
		
	}
	   
		
	}


	
