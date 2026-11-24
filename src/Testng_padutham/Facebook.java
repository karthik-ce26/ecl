package Testng_padutham;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void openweb() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	@Test(priority=1)
	public void ss() throws IOException
	{
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("D://facebook_home.png"));
	}
	@Test(priority=2)
	public void title()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=3)
	public void link()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		for(WebElement x:li)
		{
			String urls=x.getAttribute("href");
			System.out.println(urls);
			
			
		}
	}
	@AfterMethod
	public void report()
	{
		System.out.println("completed");
	}
	@AfterTest
	public void clse()
	{
		System.out.println("end");
		driver.quit();
	}
}
