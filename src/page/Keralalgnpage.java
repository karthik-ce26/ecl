package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keralalgnpage {
	WebDriver driver;
	By Kpmail=By.xpath("//*[@id=\"ulogin\"]");
	By kpppass=By.xpath("//*[@id=\"upass\"]");
	By kplog=By.id("sub_logbtn");
	
	
	public Keralalgnpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(Kpmail);
		driver.findElement(Kpmail).sendKeys(email);
		driver.findElement(kpppass);
		driver.findElement(kpppass).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(kplog).click();
	}

}
