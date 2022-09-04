package New1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();	
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wb.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//Index
		/*
		 * //wb.switchTo().frame(0); //wb.findElement(By.xpath(
		 * "//a[contains(text(),'org.openqa.selenium.chrome')]")).click();
		 * wb.switchTo().frame(1);
		 * wb.findElement(By.xpath("//a[contains(text(),'AddHasCdp')]")).click();
		 */
		 
		
		//name or ID
		/*
		 * WebElement frame1 =
		 * wb.findElement(By.xpath("//iframe[contains(@name,'packageFrame')]"));
		 * wb.switchTo().frame(frame1);
		 * wb.findElement(By.xpath("//span[contains(text(),'Action')]")).click();
		 */
		
		//webelement
		/*
		 * WebElement frame1 =
		 * wb.findElement(By.xpath("//iframe[contains(@name,'packageListFrame')]"));
		 * wb.switchTo().frame(frame1);
		 * wb.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chrome')]")
		 * ).click();
		 */
		
		wb.switchTo().frame("packageListFrame");
		wb.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chrome')]")).click();
		
		wb.switchTo().parentFrame(); //---frame within a frame , it goes to immediate frame
		
		wb.switchTo().frame("packageFrame");
		wb.findElement(By.xpath("//a[contains(text(),'AddHasCdp')]")).click();
		
		wb.switchTo().defaultContent(); //it comes out of all frames
		
	}

}
