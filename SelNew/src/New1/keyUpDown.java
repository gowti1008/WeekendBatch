package New1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyUpDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://text-compare.com/");
		Thread.sleep(1000);
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement w1 = wb.findElement(By.xpath("//textarea[contains(@id,'inputText1')]"));
		WebElement w2 = wb.findElement(By.xpath("//textarea[contains(@id,'inputText1')]"));
		w1.sendKeys("Selenium");
		Actions act = new Actions(wb);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		wb.findElement(By.xpath("//div[contains(text(),'Compare!')]")).click();
		Thread.sleep(1000);
	}

}
