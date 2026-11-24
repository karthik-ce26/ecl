package Testng_padutham;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe_pgm {
	@Test
	public void ifrm()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	
	//switch to iframe
	WebElement frame1=driver.findElement(By.name("iframeResult"));
	
	driver.switchTo().frame(frame1);
	//switch to innerframe
	WebElement innerframe=driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(innerframe);
	WebElement text=driver.findElement(By.tagName("h1"));
	System.out.println(text.getText());
	driver.switchTo().defaultContent();
	driver.quit();
	
	
	}
	

}
