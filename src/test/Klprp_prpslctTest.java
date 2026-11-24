package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Klprp_prpty;

public class Klprp_prpslctTest {
	WebDriver driver;
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
	public void test() throws InterruptedException
	{
		Klprp_prpty pp=new Klprp_prpty(driver);
		pp.hover();
		pp.ppslect();
	}
	@AfterTest
	public void end()
	{
		driver.quit();
	}

}
