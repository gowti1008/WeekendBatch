package Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("https://demo.actitime.com/login.do");;
		wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement w1 = wb.findElement(By.xpath("//input[contains(@id,'username')]"));
		WebElement w2 =  wb.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		
		int v1 = w1.getRect().x;
		int v2 = w1.getRect().width;
		
		int v3 = w2.getRect().x;
		int v4 = w2.getRect().width;

		
		  System.out.println(v1); 
		  System.out.println(v2); 
		  System.out.println(v3);
		  System.out.println(v4);
		 

		if(v1+v2==v3+v4)
		{
			System.out.println("Left");
		}
		else
			System.out.println("No");
		
		WebElement logo = wb.findElement(By.xpath("//div[@class='atLogoImg']"));
		System.out.println("logo height : " +logo.getRect().height);
		System.out.println("logo x : " +logo.getRect().x); 
		System.out.println("logo y : " +logo.getRect().y);
		
		System.out.println("logo size : " +wb.findElement(By.xpath("//div[@class='atLogoImg']")).getSize());
		
		
		System.out.println("logo loc : "+wb.findElement(By.xpath("//div[@class='atLogoImg']")).getLocation());
		  
		System.out.println("logo width : "+wb.findElement(By.xpath("//div[@class='atLogoImg']")).getRect().getWidth());
		  
		System.out.println("logo height : "+wb.findElement(By.xpath("//div[@class='atLogoImg']")).getRect().getHeight());

		System.out.println("un cssc value : "+wb.findElement(By.xpath("//input[@id='username']")).getCssValue("line-height"));
		
		wb.quit();
}

}
