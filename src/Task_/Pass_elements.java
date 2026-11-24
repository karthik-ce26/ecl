package Task_;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass_elements {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
}
@Test
public void test()
{
	driver.findElement(By.id("ulogin")).sendKeys("kkkkpp@gmail.com");
	driver.findElement(By.id("upass")).sendKeys("1234567890");
	driver.findElement(By.id("sub_logbtn")).click();
	
	
}
@After
public void close()
{
//driver.quit();
}

}
