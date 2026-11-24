package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Keralalgnpage;

public class Kplgntest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new FirefoxDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test()
	{
		Keralalgnpage ob=new Keralalgnpage(driver);
		ob.setvalues("kkkkpp@gmail.com","1234567890");
		ob.login();
	}

}
