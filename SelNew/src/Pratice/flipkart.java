package Pratice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		
		/*
		 * System.out.println(driver.manage().window().getSize());
		 * 
		 * System.out.println(driver.manage().window().getPosition());
		 */
		
		
		  driver.manage().window().maximize(); 
		  Thread.sleep(1000);
		 
		
		/*
		 * System.out.println(driver.manage().window().getSize());
		 * 
		 * System.out.println(driver.manage().window().getPosition());
		 */
		
		
		/*
		 * //setPosition Point point = new Point(30,30);
		 * driver.manage().window().setPosition(point);
		 * 
		 * 
		 * //setSize Dimension dim = new Dimension(100,100);
		 * driver.manage().window().setSize(dim);
		 */
		
		
		
		/*webdriver methods - minimize,fullscreen
		 * driver.manage().window().minimize(); Thread.sleep(1000);
		 * 
		 * driver.manage().window().fullscreen(); Thread.sleep(1000);
		 * 
		 * System.out.println(driver.manage().window().getSize());
		 * 
		 * System.out.println(driver.manage().window().getPosition());
		 */
		
		
		/*     webdriver methods - to methods
		 * driver.navigate().to("https://www.amazon.in/");
		 * driver.get("https://www.amazon.in/");
		 */
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println("title : " +title);
		
		/* 8 locators className,name,id,tagName
		 * driver.findElement(By.className("_3704LK")).sendKeys("Charger");
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.tagName("button")).click(); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.name("q")).sendKeys("Mouse"); Thread.sleep(1000);
		 */
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Watch");

		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL :" +url);
		

		
		String pageSource = driver.getPageSource();
		System.out.println("Page source: " +pageSource);
		
		for(int i=0;i<=200;i++)
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
		}
		
		driver.findElement(By.xpath("//div/a[@href='https://www.youtube.com/flipkart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Mute (m)']")).click();
		Thread.sleep(3000);
		
		String url1 = driver.getCurrentUrl();
		System.out.println("Url 1 :" +url1);
		
		driver.findElement(By.xpath("//div/ytd-button-renderer/a/tp-yt-paper-button/yt-formatted-string[(@class='style-scope ytd-button-renderer style-destructive size-default')]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		 
		
		//driver.findElement(By.xpath("//div[@class='_3qX0zy']")).click();
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a/span[@class='hDTmm5']")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[text()='Help Center']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='AioSVA']/child::*[text()='I want help with other issues']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='_1PYhW1 _3-1NOj']")).sendKeys("Refund");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='_1EQH8l']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='djVnmW _3v1CTV']/span[text()='View More']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div//div/child::div[@class='_1LJS6T v2w0ha _3v1CTV'][1]/child::div[@class='_2NKhZn'][1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/button[@class='_2KpZ6l vZGmS5'][2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div/span[@class='_2dRD24']/following::div/button[@class='_2KpZ6l vZGmS5'][3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='_2Brcj4']/child::div[@class='_3-dnWo']/following::a[text()='Careers']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//ul/li/a/img[contains(@src,'images/fk_site/Linkedin_White.png')][1]")).click();
		Thread.sleep(4000);
		//div/ul/li[@class='fk-social-list']/a[@href='https://www.linkedin.com/company/flipkart/']/following::img[@class='img-responsive'][1]
		//ul/li/a/img[contains(@src,'images/fk_site/Linkedin_White.png')][1]
		
		Set<String> wh= driver.getWindowHandles();
		System.out.println(wh);
		ArrayList<String> list= new ArrayList<String>(wh);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		
		
		
		//div/ul/li/a[@href='https://www.linkedin.com/company/flipkart/']
		//div/ul/li/a[@target='_blank']/following::img[@='img-responsive']
		
	
		
		
		driver.quit();
		
		
		/*driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']//a[@class='_2KpZ6l _3dESVI']")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//img[@alt='Bath Essentials']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//img[@alt='PARK AVENUE Luxury Soap']")).click();
		Thread.sleep(1000);
		
		
		Set<String> wh= driver.getWindowHandles();
		System.out.println(wh);
		ArrayList<String> list= new ArrayList<String>(wh);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww _27Cjkl']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww undefined _27Cjkl']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1KAjNd']")).click();
		Thread.sleep(3000);
		
		Set<String> wh1= driver.getWindowHandles();
		System.out.println(wh1);
		ArrayList<String> list1= new ArrayList<String>(wh);
		driver.switchTo().window(list1.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.quit();  */
		
	
	}


}
