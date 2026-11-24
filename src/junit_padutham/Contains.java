package junit_padutham;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
ChromeDriver driver;
@Before
public void setup()
{
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("SSSsss");
	driver.findElement(By.xpath("//*[contains(@id,\"logine7\")]")).sendKeys("ahgdg");
}
}
