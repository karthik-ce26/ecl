package Task_;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_link_response_check {
	ChromeDriver driver;
	String base_url="https://www.google.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(base_url);
	}
	@Test
	public void test() throws Exception
	{	
		List <WebElement> li=driver.findElements(By.tagName("a"));
		for(WebElement x:li)
		{
			String links=x.getAttribute("href");
			URL ob=new URL(links);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println(links+"------valid");
			}
			else
			{
				System.out.println(links+"-------invalid");
			}
		}
		
		
	}

}
