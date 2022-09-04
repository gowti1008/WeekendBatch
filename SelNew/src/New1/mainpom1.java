package New1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainpom1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		wb.get("https://demo.actitime.com/login.do");
		wb.manage().window().maximize();
		pom1 p1 =new pom1(wb);
		p1.enter();
		Thread.sleep(5000);
		wb.navigate().refresh();
		p1.enter();
		}
	}
