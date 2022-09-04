package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions action =new Actions(wb);
		Thread.sleep(2000);
		
		wb.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		Thread.sleep(2000);
		
		WebElement m = wb.findElement(By.xpath("(//div[contains(@class,'xtXmba')])[5]"));
		action.moveToElement(m).perform();
		Thread.sleep(2000);
		
		wb.switchTo().frame(0);

		WebElement o = wb.findElement(By.xpath("(//a[contains(text(),'Gaming')])[1]"));
		action.moveToElement(o).perform();
		Thread.sleep(2000);
		
}

}
