package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;


import pageobjects.Graphvalidation;
import pageobjects.Loginobjects;

public class TC_graphvalidtion extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		
		Graphvalidation version3 = new Graphvalidation(driver);
		
		
		if (version3.applicationclick()) {
		    Reporter.log("Application menu clicked successfully", true);
		} else {
		    Reporter.log("FAILED: Application menu was NOT clicked", true);
		}
		
		
		version3.distributeclick();
		Thread.sleep(3000);
		version3.clickGraph();
		version3.getgraphdata();
		version3.selectcheckbox();
		version3.clickexportbtn();
		version3.selpdf();
		

	}
}
