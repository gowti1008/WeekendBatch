package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class newTest2 extends NewTest {
	@Test
	public void a()
	{
		Reporter.log("hello world",true);
	}
	//to generate xml, right click on file and click on TestNG --> Convert to TestNG
}
