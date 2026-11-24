package Task_;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three_alert {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/button[1]")).click();
		Alert a=driver.switchTo().alert();
		String text1 = a.getText();
		String real_text="I am a JS Alert";
		if(text1.equals(real_text))
		{
			System.out.println("js alert text verified and its passed");
		}
		else
		{
			System.out.println("js alert  text verified and its passed");
		}
		Thread.sleep(3000);
		a.accept();
		
	}
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")).click();
		Alert b=driver.switchTo().alert();
		String text2=b.getText();
		if(text2.equals("iam a js confirm"))
		{
			System.out.println("text verified its correct");
		}
		else
		{
			System.out.println("text verified and not correct");
		}
		Thread.sleep(3000);
		b.dismiss();
	}
	@Test
	public void test3() throws InterruptedException
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/button[1]")).click();
		Alert c=driver.switchTo().alert();
		String text3=c.getText();
		if(text3.equals("Iam a js promt"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("not passed");
		}
		c.sendKeys("jajaja");
		
		c.accept();
		Thread.sleep(4000);
	}
	@After
	public void dismiss()
	{
		System.out.println("Test ended");
		driver.quit();
	}
	
}
