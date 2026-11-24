package Task_;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.Datalgn;

public class DataDrivenTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void Site()
	{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	@DataProvider(name="logindata")
	public  Object[][] getData() throws IOException
	{
		String path="D:\\Task login data.xlsx";
		return Datalgn.getTestData(path, "sheet1");
	}
	@Test(dataProvider="logindata")
	public void logintest(String username,String password) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.id("submit")).click();
		
		SoftAssert soft=new SoftAssert();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("logged-in-successfully"));
		String currentUrl=driver.getCurrentUrl();
		soft.assertEquals(currentUrl,"https://practicetestautomation.com/logged-in-successfully/","login failed for"+username+""+password);
		
		
		
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	

}
