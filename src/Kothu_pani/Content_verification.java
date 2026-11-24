package Kothu_pani;

import org.openqa.selenium.chrome.ChromeDriver;

public class Content_verification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String source=driver.getPageSource();
		if(source.contains("Gmail")) {
			System.out.println("content gmail is present");
		}
		else {
			System.out.println("content gmail is not present");
		}
		driver.quit();
		
	}

}
