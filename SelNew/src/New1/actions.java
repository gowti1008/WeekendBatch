package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
	WebDriver wb =new ChromeDriver();
	
	wb.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	wb.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions action =new Actions(wb);
	action.sendKeys("admin").perform();  //without selecting web element,focussing on current handling action
	//action.click().perform();
	//internally perform will call build()
	
	wb.findElement(By.xpath("//div[contains(@id,'passContainer')]")).click();
	action.sendKeys("pass").perform();  //by selecting web element
	Thread.sleep(2000);
	
	
	//action.contextClick().perform(); 
	//Thread.sleep(2000); //right click on (0,0)
	 
	
	WebElement wb1 = wb.findElement(By.xpath("//div[contains(@id,'passContainer')]"));
	action.contextClick(wb1).perform(); //right click on particular element

	}
}
