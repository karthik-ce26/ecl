package Task_;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title_content_verify {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cakehut.in/x-mas-new-year-cakes");
		String actual_title=driver.getTitle();
		System.out.println(driver.getTitle());
		String expected_title="X-Mas/New Year Cakes";
		if(actual_title.equals(expected_title))
		{
			System.out.println("title check passed");
		}
		else {
			System.out.println("title check failed ");
		}
		
		String source=driver.getPageSource();
		if(source.contains("Price"))
		{
			System.out.println("Price content is present");
		}
		else {
			System.out.println("content not present");
		}
		driver.quit();
	
	}

}
