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

public class takeSS {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		String todate=date.toString().replace(":", "-");
		System.out.println(date);

		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		
		wb.manage().window().maximize(); 
		Thread.sleep(2000);
		
		WebElement w1 = wb.findElement(By.xpath("//input[@id='username']"));
		w1.sendKeys("admin");
		
		TakesScreenshot ts = (TakesScreenshot) wb;
		
		File target = new File("./ss/"+todate+".png");
		File source = w1.getScreenshotAs(OutputType.FILE);
		
		//In line 38
		//if 'ts' is used entire page will be captured
		//if 'w1' is used particular element only will be captured
		
		FileHandler.copy(source , target);
		
		/*
		 * System.out.println(source); Thread.sleep(30000);
		 */
		
		/*
		 * WebElement w2 = wb.findElement(By.xpath("//input[@type='password']"));
		 * w2.sendKeys("manager");
		 */
		
	}
}
