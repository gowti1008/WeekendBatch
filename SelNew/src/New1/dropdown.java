package New1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32 (1)\\ChromeDriver.exe");
		WebDriver wb =new ChromeDriver();
		
		wb.get("file:///F:/Selenium/Day%2017/Assignment.html");
		wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//multiplevalues - bevarages
		  WebElement wb1 =wb.findElement(By.xpath("//select[contains(@id,'bevarages')]")); 
		  Select select = new Select(wb1); System.out.println(select.isMultiple());
		  
		  
			/*
			 * //selectByIndex select.selectByIndex(3);
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * 
			 * //selectByValue select.selectByValue("2");
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * 
			 * //selectByVisibleText select.selectByVisibleText("TEA");
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * 
			 * //deselectAll select.deselectAll();
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 */
		  
		  
			/*
			 * //deselectByIndex select.deselectByIndex(3);
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * 
			 * //deselectByValue select.deselectByValue("2");
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * 
			 * //deselectByVisibleText select.deselectByVisibleText("TEA");
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 */
		 
		  //getOptions - to get all the options, we can get through getText
			
			/*
			 * List<WebElement> allOptions = select.getOptions();
			 * 
			 * for(WebElement option:allOptions) { System.out.println(option.getText()); }
			 */
			 
		  
		  //getAllSelectedOptions - to get all the selected options
			
			
			  /*select.selectByIndex(0);
			  wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  
			  select.selectByValue("2");
			  wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  
			  List<WebElement> allOptions = select.getAllSelectedOptions(); for(WebElement
			  option:allOptions) { System.out.println(option.getText()); }*/
			 
		  //negative flow for getAllSelectedOptions
			/*
			 * List<WebElement> allOptions = select.getAllSelectedOptions(); for(WebElement
			 * option:allOptions) { System.out.println(option.getText()); } //it gives empty
			 * list,nothing will be displayed
			 */			 
		  
		  //getFirstSelectedOption - to get first Top selected option
			
			/*
			 * select.selectByValue("2");
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * 
			 * select.selectByIndex(0);
			 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * 
			 * WebElement firstOptions = select.getFirstSelectedOption();
			 * System.out.println(firstOptions.getText());
			 */
		  
		  //negative flow for getFirstSelectedOption
			/*
			 * WebElement firstOptions = select.getFirstSelectedOption();
			 * System.out.println(firstOptions.getText()); //NoSuchElementException
			 */		  
		  
		  //getWrappedElement - similar to getOptios,without loop statements
			
			/* System.out.println(select.getWrappedElement().getText()); */
		  

		//singlevalue - country
		/*
		 * WebElement wb1 =
		 * wb.findElement(By.xpath("//select[contains(@id,'country')]")); Select select=
		 * new Select(wb1); System.out.println(select.isMultiple());
		 * 
		 * //selectByIndex select.selectByIndex(3);
		 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 * 
		 * //selectByValue select.selectByValue("2");
		 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 * 
		 * //selectByVisibleText select.selectByVisibleText("NEPAL");
		 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 * 
		 * //deselectAll select.deselectAll();
		 * wb.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 */		  
		  
		 
	}

}
