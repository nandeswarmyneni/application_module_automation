package testcases;

import org.testng.annotations.Test;

import pageobjects.Loginobjects;
import pageobjects.Version3objects;

public class TC_Campus_Validations extends BaseClass {
	
	@Test
	public void campus () throws InterruptedException {
		
		
		Loginobjects login= new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		
		
		Version3objects version3 = new Version3objects(driver);
		
		version3.applicationclick();
		//Thread.sleep(3000);
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
		version3.enterrange();
		version3.inserbtn();
		version3.selectno();
		//version3.selectyes();
		
	}


}
