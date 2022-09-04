package New1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
	public WebDriver wb;
	
	//declaration
	@FindBy(id="email")
	WebElement u;
	@FindBy(id="pass") 
	WebElement p;
	 
	
	
	//initialization
	public pom(WebDriver wb)
	{
		this.wb=wb;
		PageFactory.initElements(wb, this);
		//this stores current address of the page 
	}
	
	
	//utilization
	public void enterUn()
	{
		u.sendKeys("admin");
		p.sendKeys("manager");
	}

}
