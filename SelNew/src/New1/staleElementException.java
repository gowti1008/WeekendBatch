package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElementException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://demo.actitime.com/login.do");
		//Thread.sleep(2000);
		
		wb.manage().window().maximize(); 
		//Thread.sleep(2000); 
		
		
		/*
		 * WebElement w1 =
		 * wb.findElement(By.xpath("//input[contains(@id,'username')]"));
		 * w1.sendKeys("234"); Thread.sleep(2000);
		 * 
		 * WebElement w2 = wb.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		 * w2.sendKeys("Qwe"); Thread.sleep(2000);
		 * 
		 * WebElement w3 = wb.findElement(By.xpath("//div[contains(text(),'Login')]"));
		 * w3.click(); Thread.sleep(2000);
		 * 
		 * //whenever we refresh page,new address will be generated and it gets changed
		 * so it could not get the element
		 * 
		 * 
		 * w1.sendKeys("admin"); Thread.sleep(2000);
		 * 
		 * w2.sendKeys("manager"); Thread.sleep(2000);
		 * 
		 * w3.click(); Thread.sleep(2000);
		 */
	}

}
