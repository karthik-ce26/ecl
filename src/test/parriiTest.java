package test;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.parrii;

public class parriiTest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();

	}
	@BeforeMethod
	public void site()
	{
		String baseurl="https://www.toolsqa.com/";
		driver.get(baseurl);
	}
	@Test
	public void test() throws IOException
	{
		parrii pp=new parrii(driver);
//		pp.opennewTab();
		pp.enrollv("kkkpp");
	}
	@AfterTest
	public void cls()
	{
		driver.quit();
	}
}
