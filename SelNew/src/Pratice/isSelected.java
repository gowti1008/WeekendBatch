package Pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://demo.actitime.com/login.do");
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement w1 = wb.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		w1.click();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		boolean a =w1.isSelected();
		System.out.println(a);
		
	}

}
