package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();

		wb.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		wb.manage().window().maximize(); 
		Thread.sleep(1000);
		
		WebElement en = wb.findElement(By.xpath("//a[text()='Create New Account']"));
		
		boolean en1 = en.isEnabled();
		System.out.println(en1);
		
		
		
		WebElement dis= wb.findElement(By.xpath("//a[text()='Create New Account']"));
		Thread.sleep(1000);
		
		boolean dis1 = dis.isDisplayed();
		System.out.println(dis1);
		
		wb.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		wb.findElement(By.xpath("//label[text()='Custom']")).click();
		Thread.sleep(1000);
		
		WebElement sel = wb.findElement(By.xpath("//input[@name='custom_gender']"));
		
		
		boolean sel1 = sel.isEnabled();
		System.out.println(sel1);
		
		wb.quit();
	}
}
