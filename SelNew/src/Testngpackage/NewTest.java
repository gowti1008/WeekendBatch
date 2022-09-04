package Testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	/*
	 * @Test(dataProvider = "dp") public void f(Integer n, String s) {
	 * 
	 * }
	 */
	 
	 
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method",true);
  }


	/*
	 * @DataProvider public Object[][] dp() { return new Object[][] { new Object[] {
	 * 1, "a" }, new Object[] { 2, "b" }, }; }
	 */
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("after test",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("before suite",true);
  }
  

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("after suite",true);
  }

}
