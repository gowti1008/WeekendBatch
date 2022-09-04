package Testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralrBrowsers {
	WebDriver wb;
	@Parameters({"browser"})
  @Test
  public void parallelExe(String BROWSER) {
		if(BROWSER.equals("chrome")) 
		{	
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\chromedriver_win32\\ChromeDriver.exe");
			wb =new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Google\\Edge\\msedgedriver.exe");
			wb =new EdgeDriver();
		}
		
		wb.get("https://www.facebook.com/");
		wb.quit();
  }
}
