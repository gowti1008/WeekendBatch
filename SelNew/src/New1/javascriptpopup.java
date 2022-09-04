package New1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(1000);
		
		wb.switchTo().alert().accept();
		
		wb.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(1000);
		
		wb.switchTo().alert().dismiss();
		
		wb.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(1000);
		
		wb.switchTo().alert().accept();
		
		wb.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(1000);
		
		wb.switchTo().alert().dismiss();
		
		wb.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(1000);
		
		Alert alert = wb.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("abcd");
		Thread.sleep(2000);
		alert.accept();
		
		wb.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(1000);
		
		Alert alert1 = wb.switchTo().alert();
		System.out.println(alert1.getText());
		alert.sendKeys("abcd");
		alert.dismiss();
		
		Alert alert2 = wb.switchTo().alert();
		System.out.println(alert2.getText());
		alert.dismiss();  //no such alert
	//when alert popup has only "OK" btn and if u use dismiss() it will click on "OK" btn
		
		
		
		
	}

}
