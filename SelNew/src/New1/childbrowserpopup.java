package New1;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		wb.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//img[contains(@alt,'Top Headsets from Oneplus, Samsung & More')]")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//img[contains(@alt,'Oneplus Bullets Z2 Bluetooth Wireless in Ear Earphones with Mic, Bombastic Bass - 12.4 Mm Drivers, 10 Mins Charge - 20 Hrs...')]")).click();
		Thread.sleep(1000);
		System.out.println(wb.getWindowHandle());
		
		
		Set<String> wh= wb.getWindowHandles();
		for(String w:wh)
		{
			wb.switchTo().window(w);
			System.out.println(wb.getWindowHandle());
		}
		
		wb.findElement(By.xpath("//a[contains(text(),'Join Prime')]")).click();
		Thread.sleep(1000);
		
		System.out.println(wb.getWindowHandle());
		
		
		
		
		
		/*
		 * Set<String> wh= driver.getWindowHandles(); System.out.println(wh);
		 * ArrayList<String> list= new ArrayList<String>(wh);
		 * driver.switchTo().window(list.get(1));
		 * System.out.println(driver.getCurrentUrl());
		 */
	
	}
}
