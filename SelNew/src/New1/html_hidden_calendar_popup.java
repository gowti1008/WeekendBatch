package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class html_hidden_calendar_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		/*
		 * wb.get("https://www.flipkart.com/"); Thread.sleep(1000);
		 * 
		 * wb.manage().window().maximize(); Thread.sleep(1000);
		 * 
		 * wb.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).
		 * click(); Thread.sleep(1000);
		 */
		
		wb.get("https://www.abhibus.com/");
		Thread.sleep(1000);
		
		wb.manage().window().maximize(); 
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//input[contains(@id,'datepicker2')]")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//td[contains(@data-month,'7')]//a[contains(text(),'10')]")).click();
		Thread.sleep(1000);
		
		
	}

}
