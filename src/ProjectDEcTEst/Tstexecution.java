package ProjectDEcTEst;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProjectDec.Reg_el_chck;

public class Tstexecution {
		WebDriver driver;
		String baseurl="https://www.decathlon.in/";
		@BeforeTest
		public void setup()
		{
			driver=new FirefoxDriver();
		}
		@BeforeMethod
		public void site()
		{
			driver.get(baseurl);
		}
		@Test
		public void test() throws InterruptedException {
			
			Reg_el_chck reg=new Reg_el_chck(driver);
			reg.reg_elementcheck();
		}

	}



