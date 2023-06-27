package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public WebDriver createBrowserInstance(String browser) {
		
		WebDriver driver = null;
		switch(browser.toUpperCase()) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--incognito");
			driver = new ChromeDriver(chromeOptions);
			
			break;
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.addArguments("-private");
			driver = new FirefoxDriver(firefoxoptions);
			
			
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			ieOptions.addCommandSwitches("-private");
			driver = new InternetExplorerDriver(ieOptions);
			
			
			break;
		}
		
		
		return driver;
	}
	
}
