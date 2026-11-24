package Testng_padutham;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date_picker {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		while(true)
		{
			WebElement mnth=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
			String month_names=mnth.getText();
			if(month_names.equals("November"))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
		}
		List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement singledate:date)
		{
			String da_te=singledate.getText();
			if(da_te.equals("28"))  
			{
				singledate.click();
				break;
			}
		}
	}
	

}
