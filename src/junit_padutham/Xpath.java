package junit_padutham;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

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
		//relative xpath method//
			driver.findElement(By.xpath("//input[@name=\"ulogin\"]")).sendKeys("kkkkpp@gmail.com");
			driver.findElement(By.xpath("//input[@id=\"upass\"]")).sendKeys("1234567890");
			driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]")).click();
	}
		

}
