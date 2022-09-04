package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class newTest1 extends NewTest {
	@Test(invocationCount=2)
	public void a()
	{
		Reporter.log("hello",true);
	}
//to generate xml, right click on file and click on TestNG --> Convert to TestNG 
	// if '/ ' is given in the same line in the xml file, then it is considered closing the tag 

}
