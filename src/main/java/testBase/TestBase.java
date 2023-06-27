package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import reusableComponents.PropertiesOperations;

public class TestBase {
	
	BrowserFactory bf = new BrowserFactory();
	
	
	@BeforeMethod
	public void LaunchQDPM() throws Exception {
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = PropertiesOperations.getPropertyValueByKey("url");
		
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));
		WebDriver driver = DriverFactory.getInstance().getDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
	}
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}
	
}
