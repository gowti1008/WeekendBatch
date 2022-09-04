package New1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://www.actimind.com/");
		wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		wb.manage().window().maximize(); 
		wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) wb;
		wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//javascript code-scrollBy
		//js.executeScript("window.scrollBy(0,-200)");
		 
		//javascript code-scrollTo
		//js.executeScript("window.scrollTo(0,500)");
		//wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//for - scrollBy
		
		  for (int i=0;i<=10;i++) { 
		  js.executeScript("window.scrollBy(0,200)");
		  wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); }
		 
		
		//for - scrollTo
		
		  for (int i=0;i<=10;i++) { 
		  js.executeScript("window.scrollTo(0,100)");
		  wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); }
		 
		//scroll to last
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)\r\n");
		
		
		//scrollBy:inside for loop, 1-0 to 200, 2-200 to 400, 3-400 t0 600 etc. (moves in incremental order)
	}	//scrollTo:inside for loop,It always takes(0,0) as initial position, 1-(0,0), 2-(0,200), 3-(0,200) etc
	
}
