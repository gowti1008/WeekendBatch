package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		Thread.sleep(1000);
		
		WebDriver wb =new ChromeDriver(option);
		wb.manage().window().maximize(); 
		Thread.sleep(1000);
		
		wb.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
	
	}
}
