package New1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	public WebDriver wb;
	
	@FindBy(id="username")
	WebElement u;
	@FindBy(name="pwd")
	WebElement p;
//	@FindBy(xpath="//div[contains(text(),'Login ')][1]")
//	WebElement l;
	
	public pom1(WebDriver wb )
	{
		this.wb=wb;
		PageFactory.initElements(wb, this);
	}
	
	public void enter()
	{
		u.sendKeys("admin");
		p.sendKeys("manager");
//		l.click();
	}
}
