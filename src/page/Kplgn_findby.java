package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kplgn_findby {

	WebDriver driver;
	@FindBy(name="ulogin") WebElement kpl;
	@FindBy(name="upass") WebElement kpps;
	@FindBy(id="sub_logbtn") WebElement kplbtn;
	
	public Kplgn_findby(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String passs)
	{
		kpl.sendKeys(email);
		kpps.sendKeys(passs);
	}
	public void lgn()
	{
	kplbtn.click();
	}
	
}
