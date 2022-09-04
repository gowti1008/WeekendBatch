package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class stringDataProvider {
	@DataProvider
	public String[] getData() {
		String[] s = {"1", "2", "3", "4", "5", "6"};
		return s;
	}
	@Test(dataProvider="getData")
	public void registerUser(String s)
	{
		Reporter.log("User" +s+ "registered",true);
	}

}
