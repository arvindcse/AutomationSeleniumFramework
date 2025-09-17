package base;

import utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

	protected WebDriver driver;
	
	

	@BeforeMethod
	public void setUp() {
		
		Log.info("Starting WebDriver...");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Log.info("Navigate to URL....");
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	
	}
	
	@AfterMethod
	public void tearDown() {
		
		if(driver != null) {
			
			Log.info("Closing Browser....");
		//	driver.quit();
		}
		
	}

}
