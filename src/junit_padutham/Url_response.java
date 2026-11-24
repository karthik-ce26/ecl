package junit_padutham;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url_response {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() throws Exception
	{
		URL obj=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)obj.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid url");
			
		}
		else
		{
			System.out.println("invalid url");
		}
		
	}
}
