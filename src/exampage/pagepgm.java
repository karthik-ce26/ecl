package exampage;

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
import org.testng.Assert;

public class pagepgm {
	WebDriver driver;
	@FindBy(xpath=("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[3]/a")) WebElement playgrd;
	@FindBy(xpath=("/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/a")) WebElement enrolbtn;
	@FindBy(xpath=("//*[@id=\"first-name\"]")) WebElement name;
	@FindBy(xpath=("//*[@id=\"last-name\"]")) WebElement lastname;
	@FindBy(xpath=("//*[@id=\"email\"]")) WebElement mail;
	@FindBy(xpath=("//*[@id=\"mobile\"]")) WebElement phone;
	@FindBy(xpath=("//*[@id=\"city\"]")) WebElement zity;
	@FindBy(xpath=("//*[@id=\"message\"]"))WebElement desc;
	
	
	
	public pagepgm(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void que1() throws IOException
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links == "+links.size());
		//get broken links
		
		
		for(WebElement link:links)
		{
			String href=link.getAttribute("href");
			if(href==null)
			{
				continue;
			}
			URL obj= new URL(href);
			HttpURLConnection con=(HttpURLConnection)obj.openConnection();
			con.connect();
			if(con.getResponseCode()==404)
			{
				System.out.println("broken link=="+href);
				
				
			}
			else {
				System.out.println("valid link=="+href);
				
			}
		}
	}
	public void tab()
	{	
		String parentWindow=driver.getWindowHandle();
		
		playgrd.click();
		 
		    Set<String> allwindows=driver.getWindowHandles();
		    for(String window:allwindows)
		    {
		    	if(!window.equalsIgnoreCase(parentWindow))
		    	{
		    		driver.switchTo().window(window);
		    		String title=driver.getTitle();
		    		if(title.equals("demosite")) {
		    			System.out.println("title verification passed");
		    		}
		    		else {
		    			System.out.println("title verification failed");
		    		}
		    		String url=driver.getCurrentUrl();
		    		Assert.assertEquals(url,"https://demoqa.com/","url verification failed");
		    		  
		    	}
		    	
		    	}	
		    driver.switchTo().window(parentWindow);
		     

}
	public void enroll(String firtsname,String lastnname,String email,String phonenum,String city,String des) throws IOException, InterruptedException
	{
		Thread.sleep(5000);
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	 wait.until(ExpectedConditions.elementToBeClickable(enrolbtn));
//	
		enrolbtn.click();
		name.sendKeys(firtsname);
		lastname.sendKeys(lastnname);
		mail.sendKeys(email);
		phone.sendKeys(phonenum);
		zity.sendKeys(city);
		desc.sendKeys(des);
		
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss,new File("./project//day.png"));
		
		
		
		
	}
}
