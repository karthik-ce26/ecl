package junit_padutham;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshotpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
				
	}
	@Test
	public void scrnsht() throws IOException
	{ 
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,\"DOB_Day\")]"));
		File img=day.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(img,new File("D://day.png"));
		FileHandler.copy(img,new File("./Screenshots//day.png"));
		
	}

}
