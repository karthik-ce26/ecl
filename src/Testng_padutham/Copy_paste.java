package Testng_padutham;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copy_paste {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement fullname=driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
		fullname.sendKeys("fuyoo");
		WebElement choose=driver.findElement(By.xpath("//*[contains(@name,\"login\")]"));
		Actions act=new Actions(driver);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(choose, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}

}
