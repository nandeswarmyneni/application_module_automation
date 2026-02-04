package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;


import pageobjects.Graphvalidation;
import pageobjects.Loginobjects;

public class TC_Graph7 extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		
		Graphvalidation version7 = new Graphvalidation(driver);
		
		
		if (version7.applicationclick()) {
		    Reporter.log("Application menu clicked successfully", true);
		} else {
		    Reporter.log("FAILED: Application menu was NOT clicked", true);
		}
		
		
		version7.distributeclick();
		Thread.sleep(3000);
		version7.clickGraph();
		version7.getgraphdata();
		version7.selectcheckbox();
		version7.clickexportbtn();
		version7.selpdf();
		

	}
}
