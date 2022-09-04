package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locTag {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); 
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Watch");
		
		System.out.println(driver.findElement(By.xpath("//input[@name='q']")).getAttribute("name"));
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Cart']")).getText());
		Thread.sleep(1000);
}
}
