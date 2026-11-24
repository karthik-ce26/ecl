package junit_padutham;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_text_verify {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement ss=driver.findElement(By.xpath("//input[@id=\"Register\"]"));
		String text =ss.getAttribute("value");
		System.out.println(text);
		String og_text="Create My account";
		if(text.equals(og_text))
			{
				System.out.println("TExt verified and its correct");
			}
		else
		{
			System.out.println("Text verified and not correct");
		}

	}
	@After
	public void dismiss()
	{
		System.out.println("test ended");
	}


}
