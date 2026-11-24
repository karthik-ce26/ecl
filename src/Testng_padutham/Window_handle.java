package Testng_padutham;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Window_handle {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p[1]/a")).click();
		Set<String> allWindow=driver.getWindowHandles();
		for(String this_window:allWindow)
		{
			if(!this_window.equalsIgnoreCase("ParentWindow"))
			{
				driver.switchTo().window(this_window);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("gghhpp@gmail.com");
				driver.findElement(By.xpath(" ")).click();
				driver.quit();
			}
		}
		
	}
}
