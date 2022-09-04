package New1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class elementStoring {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Date date =new Date();
		String todate= date.toString().replace(":", "-");
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		wb.manage().window().maximize(); 
		Thread.sleep(2000); 
		
		
		  WebElement a = wb.findElement(By.xpath("//input[contains(@id,'username')]"));
		  a.sendKeys("admin");
		  Thread.sleep(2000);
		  
		  String un = a.getAttribute("value");
		  System.out.println(un);
		  
			/*
			 * String un =
			 * wb.findElement(By.xpath("//input[contains(@id,'username')]")).getText();
			 * System.out.println(un); Thread.sleep(2000);
			 */
		  
		  wb.navigate().back();
		  Thread.sleep(2000);
		  wb.navigate().forward();
		  Thread.sleep(2000);
		  
		  WebElement a1 = wb.findElement(By.xpath("//input[contains(@id,'username')]"));
		  a1.sendKeys(un);
		  Thread.sleep(2000);
		  
			
			  TakesScreenshot ts = (TakesScreenshot) wb;
			  
			  File target = new File("./ss"+ todate +".png"); 
			  File source = a1.getScreenshotAs(OutputType.FILE);
			  
			  FileHandler.copy(source, target);
			  
			  wb.close();
			 
		 
		  
		 
		/*
		 * System.out.println(wb.findElement(By.xpath(
		 * "//input[contains(@id,'username')]")).getTagName());
		 * Thread.sleep(2000);
		 */
		
		/*
		 * WebElement pwd =
		 * wb.findElement(By.xpath("(//input[contains(@type,'password')])[1]"));
		 * pwd.sendKeys("manager");
		 * Thread.sleep(2000);
		 * 
		 * wb.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).clear();
		 * Thread.sleep(2000);
		 * 
		 * WebElement a =
		 * wb.findElement(By.xpath("(//input[contains(@type,'password')])[1]"));
		 * a.sendKeys("trainee");
		 * Thread.sleep(2000);
		 */
				
		 
		
		
		

		
		
		

	}

}
