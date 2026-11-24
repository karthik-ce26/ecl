package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Kplgn_findby;

public class Kplgn_findbytest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	
	{
		driver=new FirefoxDriver();
		
		}
	@BeforeMethod
	public void site()
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()
	{
		Kplgn_findby ob=new Kplgn_findby(driver);
		ob.setvalues("kkkkpp@gmail.com","1234567890");
		ob.lgn();
	}

}
