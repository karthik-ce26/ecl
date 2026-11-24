package Testng_padutham;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
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
		SoftAssert soft=new SoftAssert();
		String title=driver.getTitle();
		soft.assertEquals(title,"kerala","Title matching hkhjh");
		soft.assertTrue(driver.findElement(By.xpath("//a[@class='login']")).isDisplayed(),"is displayed");
		soft.assertAll();
	}

}
