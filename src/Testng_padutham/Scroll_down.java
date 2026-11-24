package Testng_padutham;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scroll_down {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		 driver=new ChromeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://keralaproperty.in/");
	}
	@Test
	public void test()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0, 1000)","");//by pixel
		//WebElement qc=driver.findElement(By.xpath("//h2[normalize-space()='Quick Contact']"));
		//js.executeScript("arguments[0].scrollIntoView();" ,qc);//scroll by visible element//
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
