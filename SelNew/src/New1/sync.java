package New1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sync {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://www.instagram.com/");
		//wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//If element is detected with in 5sec, it will o to next line
		//If time is up, it will return exception
		WebDriverWait wait = new WebDriverWait(wb, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'username')]")));
		
		wb.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("name");
		//wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	//implicit is used for findelement and findelements
	//Explicit executes 1st even when implicit is used,bcoz java follows step by step execution

}
