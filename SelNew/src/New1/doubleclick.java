package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://drive.google.com/drive/my-drive");
		Thread.sleep(1000);
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//input[contains(@id,'identifierId')]")).sendKeys("gowthamshiva179@gmail.com");
		Thread.sleep(2000);
		
		wb.findElement(By.xpath("(//div[contains(@class,'VfPpkd-RLmnJb')])[2]")).click();
		Thread.sleep(2000);
		
		Actions action =new Actions(wb);
		Thread.sleep(2000);

		WebElement a = wb.findElement(By.xpath("//div[contains(@class,'l-u-Ab-zb-Pn-ve')]"));
		action.doubleClick(a);
		Thread.sleep(2000);
		
}


}
