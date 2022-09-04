package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount {
	//invocation count is used to repeat same test case multiple time, default value is one, it accepts only positive numbers
	
	@Test(invocationCount=0)
	public void registerUser1() {
	Reporter.log("User 1 registered",true); }
	 
	
	final int a =3;
	@Test(invocationCount=a)
	public void registerUser()
	{
		Reporter.log("User registered",true);
	}
}
