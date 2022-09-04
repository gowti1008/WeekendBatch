package Pratice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigBasket {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();

		wb.get("https://www.bigbasket.com/");
		Thread.sleep(1000);
		
		wb.manage().window().maximize();
		Thread.sleep(1000);
		
		wb.findElement(By.id("input")).sendKeys("Apple");
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//button[@class='btn btn-default bb-search']")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//span[text()='Fresho']")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//div[@class='col-sm-12 col-xs-12 add-bskt']//input[@ng-model='vm.startQuantity'][1]")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//div[@class='col-sm-12 col-xs-12 add-bskt']//input[@ng-model='vm.startQuantity'][1]")).clear();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//div[@class='col-sm-12 col-xs-12 add-bskt']//input[@ng-model='vm.startQuantity'][1]")).sendKeys("3");
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//div[@class='col-sm-5 col-xs-5 pad-0']/button[@qa='add']")).click();
		Thread.sleep(3000);
		
		wb.findElement(By.xpath("//input[@value='3 in basket']/following::button[@class='btn rt'][1]")).click();
		Thread.sleep(3000);
		
		wb.findElement(By.xpath("//a[@qa='myBasket']")).click();
		Thread.sleep(1000);
		
		wb.findElement(By.xpath("//footer[@class='ng-scope']")).click();
		Thread.sleep(1000);
		
		
		  for(int i=0;i<=200;i++) {
		  wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN); }
		 
		
		
		
		wb.findElement(By.xpath("//a[@class='twitterBtn smGlobalBtn']")).click();
		Thread.sleep(4000);
		
		Set<String> wh= wb.getWindowHandles();
		System.out.println(wh);
		ArrayList<String> list= new ArrayList<String>(wh);
		wb.switchTo().window(list.get(1));
		System.out.println(wb.getCurrentUrl());
		
		/*
		 * for(int i=0;i<=200;i++) {
		 * wb.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN); }
		 */
		
		wb.findElement(By.xpath("//a[@aria-label='Settings']/child::div[@class='css-1dbjc4n r-1awozwy r-sdzlij r-18u37iz r-1777fci r-dnmrzs r-xyw6el r-o7ynqc r-6416eg']")).click();
		Thread.sleep(2000);
		
		wb.findElement(By.xpath("//input[@type='checkbox' and @role='switch']")).click();
		Thread.sleep(1000);
		
		 wb.findElement(By.xpath("//span[text()='Cancel']")).click();
		 Thread.sleep(1000);
		 
		Set<String> wh1= wb.getWindowHandles();
		System.out.println(wh1);
		ArrayList<String> list1= new ArrayList<String>(wh);
		wb.switchTo().window(list1.get(0));
		System.out.println(wb.getCurrentUrl());
		 
		 wb.quit();
		
	
			
	}


}
