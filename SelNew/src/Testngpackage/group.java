package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group extends groupexecution {
	@Test(groups="smoke")
	public void regUser() {
		Reporter.log("User registered",true);
	}

	@Test(groups="reg")
	public void loginUser() {
		Reporter.log("User login",true);
	}

	@Test(groups="ft")
	public void delUser() {
		Reporter.log("User deleted",true);
	}
	
	@Test(groups="smoke")
	public void regcus() {
		Reporter.log("cus registered",true);
	}
	
	@Test(groups="reg")
	public void cusUser() {
		Reporter.log("cus login",true);
	}
	
	@Test(groups="ft")
	public void delcus() {
		Reporter.log("cus deleted",true);
	}
	
	@Test(groups={"smoke","reg","ft"})
	public void regusercus() {
		Reporter.log("User,cus registered",true);
	}
	
//refer group xml
//tags --> group,run,include,exclude
//if group is not mentioned for a test, that particular test also will be executed during run time
//avoid commenting in xml files
	
}
