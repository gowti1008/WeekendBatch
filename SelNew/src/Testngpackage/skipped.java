package Testngpackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class skipped {
  @Test(priority=1)
  public void f() {
	  Reporter.log("Registered",true);
	  Assert.fail();   //if we use here, other will not be executed, it will get skipped
  }
  
  @Test(priority=2,dependsOnMethods="f") //dependsOnMethods is used for dependency,if we use priority and dependency, dependency will get executed
  public void f2()
  {
	  Reporter.log("log in",true);
  }
}

/*cyclic dependency
 * @Test(priority=1,dependsOnMethods="f2")
 * 
 * @Test(priority=2,dependsOnMethods="f")
 */