package ProjectDec;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Reg_el_chck {
		WebDriver driver;
		@FindBy(xpath="") WebElement login_option;
		@FindBy(xpath="//*[@id=\"app\"]/nav/div/div[2]/img")WebElement logo;
		@FindBy(id="IN0903GO")WebElement ggle;
		@FindBy(xpath="//*[@id=\"IN0903FB\"]")WebElement fcbook;
		@FindBy(xpath="//*[@id=\"IN0903APP\"]")WebElement apple;
		
		public Reg_el_chck(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
		public void reg_elementcheck() throws InterruptedException
		{
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		
			wait.until(ExpectedConditions.visibilityOf(login_option));
			login_option.click();
			
			
			//url validation//
			String expectedUrl="https://login.decathlon.net/?client_id=bce9a8f8-7197-4ea8-859e-3ace085db2e7&ui_locales=en_IN#/sign-in";
			String currenturl=driver.getCurrentUrl();
			SoftAssert st=new SoftAssert();
			st.assertEquals(expectedUrl,currenturl,"Url missmatch");
			
			
			//verify elemets visible,enabled//
			boolean log=logo.isDisplayed();
			if(log) {
				System.out.println("The logo is visible");
			}
			else {
				System.out.println("logo not visible");
			}
			boolean google=ggle.isEnabled();
			if(google) {
				System.out.println("Google option Enabled");
			}
			else {
				System.out.println("Google option Disabled");
			}
			boolean facebook=fcbook.isEnabled();
			if(facebook) {
				System.out.println("Facebook option is enables");
			}
			else {
				System.out.println("Facebook option not enabled");
			}
			boolean appl=apple.isEnabled();
			if(appl)
			{
				System.out.println("Apple login is enabled");
			}
			else {
				System.out.println("Apple login disabled");
			}
			
			
			
			
			
			
			
			
		}

	}

