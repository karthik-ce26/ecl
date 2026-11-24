package junit_padutham;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elert_hendling {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/KK/Desktop/javehhh/Alerrrttt.html");
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		String real_text="Hello this a alert";
		if(text.equals(real_text))
		{
			System.out.println("TEXT verified and its correct");
		}
		else
		{
			System.out.println("Text verified and its wrong");
		}
		a.accept();
		driver.findElement(By.xpath("//input[@name=\"first name\"]")).sendKeys("SSSS");
		driver.findElement(By.xpath("//input[@name=\"last name\"]")).sendKeys("Hussii");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
	}
	@After
	public void end()
	{
		System.out.println("test end");
	}

}
