package New1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class elementSS {
	public static void main(String[] args) throws IOException, InterruptedException {
		Date date = new Date();
		String todate = date.toString().replace(":", "-");
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
	WebDriver wb =new ChromeDriver();
	
	wb.get("https://www.google.com/");
	Thread.sleep(1000);
	
	wb.manage().window().maximize(); 
	Thread.sleep(2000);
	
	WebElement tb = wb.findElement(By.xpath("//img[@class='lnXdpd']"));
	
	TakesScreenshot ts = (TakesScreenshot) wb;
	
	File target = new File("./ss/"+todate+".png");
	File source = tb.getScreenshotAs(OutputType.FILE);
	
	//In line 34
	//if 'ts' is used entire page will be captured
	//if 'tb' is used particular element only will be captured
	
	FileHandler.copy(source, target);
	}

}
