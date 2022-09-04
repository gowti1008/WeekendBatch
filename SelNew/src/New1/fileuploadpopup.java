package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(1000);
		
		wb.manage().window().maximize(); 
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//input[contains(@name,'upfile')]")).sendKeys("C:\\Users\\hp\\Desktop\\Doc.txt");
		Thread.sleep(1000);
	}
}
