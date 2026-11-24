package Task_;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ninjas {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void sitecall()
	{
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("kkk");
		driver.findElement(By.name("lastname")).sendKeys("ppp");
		driver.findElement(By.name("email")).sendKeys("kkkkkkkkkpppppppp@gmail.com");
		Thread.sleep(3000);
		File scrnshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrnshot, new File("D://email.png"));
		driver.findElement(By.name("telephone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("Onetwothree@123");
		driver.findElement(By.name("confirm")).sendKeys("Onetwothree@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//i[@class=\"fa fa-user\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		
		WebElement sitemp=driver.findElement(By.xpath("//a[normalize-space()='Site Map']"));
		File siteimg=sitemp.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(siteimg, new File("./Screenshots/sitemp.png"));
		driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
		driver.findElement(By.name("name")).sendKeys("kkkppp");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kkkkpppp@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='input-enquiry']")).sendKeys("better luck next time.");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	}
	@AfterTest
	public void close()
	{
		System.out.println("ninjas test completed");
		driver.quit();
		
	}
	

}
