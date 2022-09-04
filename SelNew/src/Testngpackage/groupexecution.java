package Testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class groupexecution {
 
  @BeforeMethod(alwaysRun =true)
  public void beforeMethod() {
	  Reporter.log("Before method",true);
  }

  @AfterMethod(alwaysRun =true)
  public void afterMethod() {
	  Reporter.log("After method",true);
  }

  @BeforeClass(alwaysRun =true)
  public void beforeClass() {
	  Reporter.log("Before class",true);
  }

  @AfterClass(alwaysRun =true)
  public void afterClass() {
	  Reporter.log("After class",true);
  }

  @BeforeTest(alwaysRun =true)
  public void beforeTest() {
	  Reporter.log("Before test",true);
  }

  @AfterTest(alwaysRun =true)
  public void afterTest() {
	  Reporter.log("After test",true);
  }

  @BeforeSuite(alwaysRun =true)
  public void beforeSuite() {
	  Reporter.log("Before suite",true);
  }

  @AfterSuite(alwaysRun =true)
  public void afterSuite() {
	  Reporter.log("After suite",true);
  }

}
