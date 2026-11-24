package Testng_padutham;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import utils.Excel_utils;

public class Poi_prgram {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver =new FirefoxDriver();
		driver.get("https://keralaproperty.in/member/login/");
		
	}
	@DataProvider(name="logindata")
		public Object[][] getData() throws IOException
		{
		String path="D:\\Login.xlsx";
		return Excel_utils.getTestData(path,"sheet1");
		}
	@Test(dataProvider="logindata")
	public void logintest(String username,String password)
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(password);
		driver.findElement(By.id("sub_logbtn")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl,"https://keralaproperty.in/member/myhome/","login may failed for:"+username);
		
	}
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
	
	

}
