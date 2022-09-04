package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//program to get pattern of login,update,logout & login,delete,logout
public class prePostCond {
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@Test(priority=1)
	public void update()
	{
		Reporter.log("update",true);
	}

	@Test(priority=2)
	public void delete()
	{
		Reporter.log("delete",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
}
