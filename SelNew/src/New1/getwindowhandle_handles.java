package New1;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandle_handles {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\ChromeDriver.exe");
		//C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\ChromeDriver.exe
		WebDriver wb = new ChromeDriver();
		
		System.out.println(wb.getWindowHandles());
		
		wb.switchTo().newWindow(WindowType.TAB); //new tab will open
		//wb.switchTo().newWindow(WindowType.WINDOW); //new window will open
		
		System.out.println(wb.getWindowHandles());
	}
}
