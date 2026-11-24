package Kothu_pani;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title_check {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		String actual_title=driver.getTitle();
		
		System.out.println(actual_title);
		
		String expected_title="Google";
		
		if(actual_title.equals(expected_title)) {
			
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("failed");
		}
		driver.quit();
		
	}

}
