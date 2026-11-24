package Testng_padutham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Hard_Assertion {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://keralaproperty.in/");
	}
	@Test
	public void test()
	{
		String actual_title=driver.getTitle();
		Assert.assertEquals(actual_title,"kerala property","title verified");
		System.out.println("title");
	}
	@Test
	public void test2()
	{	
		WebElement search=driver.findElement(By.xpath("//a[@role='button']"));
		Boolean searchcheck=search.isEnabled();
		Assert.assertTrue(searchcheck,"it is not enabled");
	}

}
