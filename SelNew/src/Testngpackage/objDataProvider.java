package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class objDataProvider {
	@DataProvider
	public  Object[] getData()
	{
		Object[] a = {true, "A", "Alan", 1, 123.87};
		return a;
	}
	@Test(dataProvider = "getData")
	public void userRegister(Object a)
	{
		Reporter.log(" User " +a+ " Register ",true);
	}

}
