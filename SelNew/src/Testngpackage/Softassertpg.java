package Testngpackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertpg {
  @Test
  public void f() 
  {
	  Reporter.log("Test 1",true);
	  Reporter.log("Test 2",true);
	  SoftAssert asserrt = new SoftAssert();
	  asserrt.assertEquals("abc", "ab");  
	  //soft assert - remaining lines of code will also be executed after getting failed
	  Reporter.log("Test 3",true);
	  asserrt.assertAll(); // it is mandatory,don't write any code after this
	  
  }
}
