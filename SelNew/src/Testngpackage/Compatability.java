package Testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Compatability {
	@Parameters({"browser"})
  @Test
  public void parallelExe(String BROWSER) {
		if(BROWSER.equals("chrome")) 
		{	
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
			WebDriver wb =new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Google\\Edge\\msedgedriver.exe");
			WebDriver wb =new EdgeDriver();
		}
  }
}
