package examtest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import exampage.pagepgm;

public class tstpgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void site()
	{
		String baseUrl=("https://toolsqa.com/");
		driver.get(baseUrl);
		
	}
	@Test
	public void test() throws IOException, InterruptedException
	{
		pagepgm exam=new pagepgm(driver);
		//exam.que1();
		//exam.tab();
	exam.enroll("kkk","sss", "kkkppp@gmail.com","1234567890","japan","exam testss");
		
	}
	
	
	

}
