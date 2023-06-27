package testBase;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	
	//Singleton Design Pattern
	private DriverFactory() {
		
	}
	
	private static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
	}
	
	
	//Factory Design Pattern
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void setDriver(WebDriver driverParam) {
		driver.set(driverParam);
	}
	
	public void closeBrowser() {
		driver.get().close();
		driver.remove();
	}
	
}
