package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class printReport {
  @Test
  public void f() 
  {
	  Reporter.log("hello",true);
  }
}
