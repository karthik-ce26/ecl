package page;


import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class parrii {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div/div/a") WebElement sbtn;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/a") WebElement enroll;
	@FindBy(name="firstName") WebElement nm;
	
	public parrii(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void question1() throws IOException
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no of links"+links.size());
		for(WebElement link:links) {
			String href=link.getAttribute("href");
			
			if(href==null || href.isEmpty())
			{
				continue;
			}
			URL obj= new URL(href);
			HttpURLConnection con=(HttpURLConnection)obj.openConnection();
			con.connect();
			
			 if(con.getResponseCode()==404)
			{
				System.out.println(href+"==broken link");
			}
			 else
			 {
				 System.out.println(href+"==valid link");
			 }	
			}	
		}
		
		
	
	public void opennewTab()
	{
		String parentWindow=driver.getWindowHandle();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
	 wait.until(ExpectedConditions.elementToBeClickable(sbtn));
		    sbtn.click();
		    Set<String> allwindows=driver.getWindowHandles();
		    for(String window:allwindows)
		    {
		    	if(!window.equalsIgnoreCase(parentWindow))
		    	{
		    		driver.switchTo().window(window);
		    		String title=driver.getTitle();
		    		     
		    	}
		    }
		    
		    
//		String newTitle=driver.getTitle();
//		System.out.println(newTitle);
	}
	
	public  void enrollv(String name) {
		enroll.click();
		nm.sendKeys(name);

}
	
	public void ss() throws IOException
	{
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss,new File("./Screenshots//day.png"));
	}
}
