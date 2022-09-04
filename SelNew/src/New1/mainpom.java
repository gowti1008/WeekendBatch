package New1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainpom {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\ChromeDriver.exe");
	WebDriver wb =new ChromeDriver();
	wb.get("https://www.facebook.com/");
	pom p1 =new pom(wb);
	p1.enterUn();
	Thread.sleep(5000);
	wb.navigate().refresh();
	p1.enterUn();
	}
}
