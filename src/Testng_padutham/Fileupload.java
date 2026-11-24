package Testng_padutham;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
		
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("uploadfile_0")).sendKeys("D:\\karthik kannan resume.pdf");
		driver.findElement(By.name("send")).click();

	}

}
