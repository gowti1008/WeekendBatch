package Testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Compatability1java {
	  final String a="https://www.amazon.in/";
		//https://demo.actitime.com/login.do
	  @Parameters({"url"})
	  @Test
	  public void parExe(@Optional(a)String URL) {
		  System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Google\\Edge\\msedgedriver.exe");
			WebDriver wb =new EdgeDriver();
		  wb.get(URL);
	  }
  }