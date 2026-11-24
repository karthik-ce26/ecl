package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Regdetails_task;

public class Regtst_run {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void getsite()
	{
		driver.get("https://blazedemo.com/register");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException
	{
		Regdetails_task rd=new Regdetails_task(driver);
		rd.passvalues("kkkppp","Cognix","kkk@gmail.com","Onetwothre@123","Onetwothre@123");
		Thread.sleep(3000);
		rd.registerbtn();
		
		
	}

}
