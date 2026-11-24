package Testng_padutham;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drop_select_test {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void opensite()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void selectdropdown() throws InterruptedException
	{
		WebElement dropdown=driver.findElement(By.xpath("//select[@class=\"day\"]"));
		Select ss=new Select(dropdown);
		ss.selectByValue("02");
		Thread.sleep(4000);
		List<WebElement> daylist=ss.getOptions();
		System.out.println("value passedn to day");
		System.out.println("the count of days are::"+daylist.size());
		
		
		WebElement mnth=driver.findElement(By.xpath("//select[@class=\"middle month\"]"));
		Select month=new Select(mnth);
		month.selectByVisibleText("APR");
		Thread.sleep(2000);
		List<WebElement> mnthlist=month.getOptions();
		System.out.println("value passed to month");
		System.out.println("The count of month are::"+mnthlist.size());
		
		WebElement yr=driver.findElement(By.xpath("//select[@class=\"year\"]"));
		Select year=new Select(yr);
		year.selectByValue("2006");
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void cls()
	{
		driver.quit();
	}

}
