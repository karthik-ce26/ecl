package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Klprp_prpty {
	WebDriver driver;
	@FindBy(xpath="/html/body/header/div[1]/div/div/a") WebElement drop;
	@FindBy(xpath="/html/body/header/div[1]/div/div/ul/li[9]/a") WebElement mlprm;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/div/div[1]/div/div/a") WebElement viewdetails;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div[2]/ul/li[3]/a") WebElement facilities;
	
	public Klprp_prpty(WebDriver driver) 
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	public void hover() throws InterruptedException
	{	
		Actions act = new Actions(driver);
		act.moveToElement(drop);
		Thread.sleep(5000);
		act.moveToElement(mlprm);
		Thread.sleep(1000);
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(15));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div[1]/div/div/ul/li[9]/a")));

		
		mlprm.click();
	}
	public void ppslect() throws InterruptedException
	{
		viewdetails.click();
		Thread.sleep(2000);
		facilities.click();
		Thread.sleep(2000);
	}
	
	
	
	

}
