package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ObjectRepo {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public CommonMethods cm = new CommonMethods(); 

	
}
