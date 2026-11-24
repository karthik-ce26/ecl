package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Regdetails_task {
	WebDriver driver;
	@FindBy(name="name") WebElement nm;
	@FindBy(name="company") WebElement cmpny_name;
	@FindBy(name="email") WebElement email_adress;
	@FindBy(name="password") WebElement password;
	@FindBy(name="password_confirmation") WebElement cnfrm_pass;
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button") WebElement reg;
	
	
	public Regdetails_task(WebDriver driver)
	{
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	public void passvalues(String name,String cmpny,String email,String pass,String cfpas)
	{
		nm.sendKeys(name);
		cmpny_name.sendKeys(cmpny);
		email_adress.sendKeys(email);
		password.sendKeys(pass);
		cnfrm_pass.sendKeys(cfpas);
	}
	public void registerbtn()
	{
		reg.click();
	}
	
}
	


