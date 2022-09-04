package New1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();	
		wb.manage().window().maximize();
		
		wb.get("https://www.google.com/");
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> allLinks = wb.findElements(By.xpath("//a"));
		
		//for loop
		/*
		 * for(int i =1;i<allLinks.size();i++) { System.out.println(allLinks.size());
		 * WebElement link =allLinks.get(i); System.out.println(link.getText()); }
		 */
		
		//for each loop
		/*
		 * System.out.println(allLinks.size());
		 * 
		 * for(WebElement link:allLinks) { System.out.println(link.getText()); }
		 * wb.close();
		 */
		
		
		
			
		}
		
	}