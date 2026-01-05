package testcases;

import org.testng.annotations.Test;

import pageobjects.Loginobjects;

public class TC_Login extends BaseClass {

	public Loginobjects lg;

	@Test(priority = 1)
	public void loginPagetest() throws InterruptedException {
		Loginobjects login = new Loginobjects(driver);
		login.sendUsernameAndPassword("emp33@test.com", "a765cbf2dc83768241383056f8d9a9f4");
		

	}

}
