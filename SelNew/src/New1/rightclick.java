package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions action =new Actions(wb);
		Thread.sleep(2000);
		
		WebElement a = wb.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		action.contextClick(a).perform();
		Thread.sleep(2000);
}



}
