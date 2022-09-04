package Testngpackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertpg {
  @Test
  public void f()
  {
	  //Assert.fail();  //intentionally we are making it fail,we use assert for verificaton
	  Reporter.log("Test 1",true);
	  //Assert.fail();  //don't write any code after this line,bcz it won't get executed
	  //Assert.assertEquals("1", "7"); //it is used to compare
	  //Assert.assertEquals(true, false);
	  //Assert.assertEquals(true, true);
	  Assert.assertEquals("abc", "ab"); 
	  //we can see failed xml in testngfaild.xml from test output
  }
}
