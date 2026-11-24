package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class klprp_qc {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[1]/form/div[1]/input") WebElement fname;
	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[1]/form/div[2]/input") WebElement phn;
	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[1]/form/div[3]/input") WebElement mail;
	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[1]/form/div[4]/textarea") WebElement mssg;
	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[1]/form/input") WebElement subbtn;
	@FindBy(xpath="/html/body/div[4]/div/div[3]/div[1]/h2") WebElement qc_scroll;

	
	public klprp_qc(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",qc_scroll);
	}
	public void valuepass(String fullname,String phonenum,String email,String message)
	{
		fname.sendKeys(fullname);
		phn.sendKeys(phonenum);
		mail.sendKeys(email);
		mssg.sendKeys(message);
		
	}
	public void submit()
	{
		subbtn.click();
	}
}
