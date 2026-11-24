package Task_;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void test()
	{
		String title=driver.getTitle();
		String expected ="Swag Labs";
		if(expected.equals(title))
		{
			System.out.println("Title check pass");
		}
		else {
			System.out.println("title check fail");
		}

	



	}
	@Test
	public void test2()
	{
		String con=driver.getPageSource();
	
		if(con.contains("Swag Labs"))
		{
			System.out.println("content check passed");
		}
		else
		{
			System.out.println("content check failed");
		}
	}
	@Test
	public void test3() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		
	}
	@After
	public void close()
	{
		
	}

}
