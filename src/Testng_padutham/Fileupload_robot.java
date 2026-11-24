package Testng_padutham;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_robot {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void site()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_excel");
	}
	@Test
	public void test() throws AWTException, InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Select PDF file']")).click();
		fileUpload("D:\\karthik kannan resume.pdf");
	}
	public void fileUpload(String fuyoo) throws AWTException, InterruptedException {
		StringSelection strfuyoo=new StringSelection(fuyoo);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strfuyoo,null);
		Robot robot= new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
