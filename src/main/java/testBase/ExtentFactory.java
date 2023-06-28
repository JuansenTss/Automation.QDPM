package testBase;

import com.aventstack.extentreports.ExtentTest;

public class ExtentFactory {
		
	//Singleton Design Pattern
	private ExtentFactory() {
		
	}
	
	private static ExtentFactory instance = new ExtentFactory();
	
	public static ExtentFactory getInstance() {
		return instance;
	}
	
	
	//Factory Design Pattern
	ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();
	
	public ExtentTest getExtent() {
		return extent.get();
	}
	
	public void setExtent(ExtentTest extentTestObject) {
		extent.set(extentTestObject);
	}
	
	public void removeExtentObject() {
		extent.remove();
	}
}
