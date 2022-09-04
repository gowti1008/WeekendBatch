package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	
	//priority is to prioritize which test case need to be executed first
	//use emailable report to see results
	@Test(priority=1)
	public void registerUser()
	{
		Reporter.log("User registered",true);
	}
	
	@Test(priority=2)
	public void editRegister() {
		Reporter.log("User edited",true);
	}
	
	@Test(priority=3)
	public void deleteUser() {
		Reporter.log("User deleted",true);
	}
	
}
