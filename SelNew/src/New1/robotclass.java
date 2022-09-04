package New1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		wb.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		
		
		
		Robot r = new Robot();
		//notification
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		//allow
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		//block
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		//enter
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
	}

}
