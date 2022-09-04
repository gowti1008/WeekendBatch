package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions action =new Actions(wb);
		Thread.sleep(1000);
		
		wb.switchTo().frame(0);
		
		WebElement source = wb.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement target = wb.findElement(By.xpath("//div[contains(@id,'droppable')]"));
		
		action.dragAndDrop(source, target).perform();
	}
}