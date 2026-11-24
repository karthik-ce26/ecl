package Testng_padutham;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logo_check {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void testlogo()
	{
		Boolean b=driver.findElement(By.xpath("//img[@title='Rediffmail']")).isDisplayed();
		if(b)
		{
			System.out.println("displayed");
			
		}
		else
		{
			System.out.println("not displayed");
		}
	}
	@Test
	public void radiobtn()
	{
		Boolean eb=driver.findElement(By.xpath("//label[normalize-space()='Male']")).isEnabled();
		if(eb)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("disabled");
		}
	}
	@Test
	public void agreetest()
	{
		Boolean ab=driver.findElement(By.xpath("//*[contains(@name,\"chk_altemail\")]")).isSelected();
		if(ab)
		{
			System.out.println("selected");
			
		}
		else
		{
			System.out.println("not selected");
		}
		
	}
}
