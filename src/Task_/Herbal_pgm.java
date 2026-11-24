package Task_;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Herbal_pgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://rishiherbalindia.linker.store");
	}
	@Test
	public void test() throws IOException, InterruptedException
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		//title verification
		SoftAssert soft=new SoftAssert();
		String actual_title=driver.getTitle();
		soft.assertEquals(actual_title,"Herbal Products | Rishi Herbal India","Title mismatch");
		//check box checking
		driver.findElement(By.xpath("//*[@id=\"outOfStockFilter\"]")).click();
		
		//search 
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("super health");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).click();
		
		
		//screenshot
		WebElement baby=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[6]/a"));
		File babyimg=baby.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(babyimg,new File("./Screenshots//babyfield.png"));
	
		
		//dropdwn selection
		WebElement drop_down=driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
		Select ss=new Select(drop_down);
		ss.selectByValue("alphabet-asc");
		Thread.sleep(5000);
		
		//Click on skinlink
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
		//scroll down
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement aloe=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[14]/div/div/div[1]/div/a/img"));
		js.executeScript("arguments[0].scrollIntoView();", aloe);
	
		
		
	}
	@AfterTest
	public void end()
	{
		System.out.println("Test ended");
		driver.quit();
	}

}
