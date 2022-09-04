package Testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Compatability1edge {
	final String a="https://www.amazon.in/";
	//https://demo.actitime.com/login.do
  @Parameters({"url"})
  @Test
  public void parExe(@Optional(a)String URL) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
	  WebDriver wb =new ChromeDriver();
	  wb.get(URL);
  }
}