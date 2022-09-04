package New1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screencapture {
	
	public static void main(String[] args) throws IOException {
		
		Date date = new Date();
		String todate = date.toString().replace(':', '-');
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://www.wikipedia.org/");
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement w1 = wb.findElement(By.xpath("//input[contains(@id,'searchInput')]"));
		w1.sendKeys("Watch");
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		wb.findElement(By.xpath("//button[contains(@class,'pure-button pure-button-primary-progressive')]")).click();
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		for(int i=0;i<=200;i++)
		{
			wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			
			//wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
			
			//wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		
		for(int j=0;j<=200;j++)
		{
			wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
		}
		
		
				
		
		wb.findElement(By.xpath("//span[contains(text(),'View history')]")).click();
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		for(int k=0;k<=200;k++)
		{
			wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		
		wb.findElement(By.xpath("//img[contains(@alt,'Wikimedia Foundation')]")).click();
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		for(int a=0;a<=200;a++)
		{
			wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		
		wb.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		wb.navigate().back();
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String url = wb.getCurrentUrl();
		System.out.println(url);
		
		wb.navigate().back();
		wb.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		wb.quit();
		
		
		
		/*
		 * TakesScreenshot t1 = (TakesScreenshot) wb;
		 * 
		 * File t = new File("./" +todate+ ".png" ); //File s =
		 * w1.getScreenshotAs(OutputType.FILE); File s1 =
		 * t1.getScreenshotAs(OutputType.FILE);
		 * 
		 * FileHandler.copy(s1, t);
		 */
		
		//If 's' is used element ss will be captured
		//If 's1' is used entire page will be captured
		
		
	}

}
