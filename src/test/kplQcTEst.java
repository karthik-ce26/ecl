package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.klprp_qc;

public class kplQcTEst {
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
	public void qc_valuepass() throws InterruptedException
	{
		klprp_qc qv=new klprp_qc(driver);
		qv.scroll();
		qv.valuepass("kkkppp","1234567890","kkkppp@gmail.com","this is a testing message...... ");
		Thread.sleep(3000);
		qv.submit();
	}

}
