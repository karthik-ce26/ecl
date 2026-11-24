package Testng_padutham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_n_drop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://webdriveruniversity.com/Actions/index.html");
	}
	@Test
	public void test()
	{
		WebElement drg=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drp=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drg, drp);
		ac.perform();
	}
	

}
