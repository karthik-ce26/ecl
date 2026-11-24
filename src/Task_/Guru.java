package Task_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void drag() throws InterruptedException
	{
		
		Actions ac=new Actions(driver);
		//debit side ac bank & amount 5000 drag&drop
		ac.dragAndDrop(driver.findElement(By.xpath("//*[@id='credit2']/a")),driver.findElement(By.xpath("//*[@id='bank']/li")));
		ac.dragAndDrop(driver.findElement(By.xpath("//*[@id='fourth']/a")),driver.findElement(By.xpath("//*[@id='amt7']/li")));
		
//		Thread.sleep(3000);
//		
//		//credit side ac sales and amout 5000
		ac.dragAndDrop(driver.findElement(By.xpath("//*[@id='credit1']/a")),driver.findElement(By.xpath("//*[@id='loan']/li")));
		ac.dragAndDrop(driver.findElement(By.xpath("//*[@id='fourth']/a ")), driver.findElement(By.xpath("//*[@id='amt8']/li")));     
//		
		ac.perform();
		
	}
}
