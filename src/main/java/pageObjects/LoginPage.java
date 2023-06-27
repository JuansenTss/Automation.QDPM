package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver = null;
	
	@FindBy(name="login[email]")
	WebElement input_email;
	
	@FindBy(name="login[password]")
	WebElement input_password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement button_login;
	
	
	//Initialize the Objects for driver instance
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	//Login QDPM
	public void login(String email, String password) {
		input_email.sendKeys(email);
		input_password.sendKeys(password);
		button_login.click();
	}
}
