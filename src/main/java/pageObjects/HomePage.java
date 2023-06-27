package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver = null;
	
	@FindBy(xpath="//ul[@class='page-sidebar-menu']//span[text()='Dashboard']")
	WebElement menu_Dashboard;
	
	@FindBy(xpath="//ul[@class='page-sidebar-menu']//a[@href='/index.php/projects']//span[text()='Projects']")
	WebElement menu_Projects;
	
	@FindBy(xpath="//ul[@class='page-sidebar-menu']//a[@href='/index.php/projects']//following-sibling::ul//span[text()='View All']")
	WebElement submenu_Projects_ViewAll;
	
	@FindBy(xpath="//ul[@class='page-sidebar-menu']//a[@href='/index.php/projects']//following-sibling::ul//span[text()='Add Project']")
	WebElement submenu_Projects_AddProject;
	
	
	//Initialize the Objects for driver instance
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void clickOnMenuAndSubMenu(String menu, String subMenu) {
		
		String menu_xPath = "//ul[@class='page-sidebar-menu']//a[@href='/index.php/projects']//span[text()='" + menu + "']";
		driver.findElement(By.xpath(menu_xPath)).click();;
		
		String subMenu_xPath = "//ul[@class='page-sidebar-menu']//a[@href='/index.php/projects']//following-sibling::ul//span[text()='" + subMenu + "']";
		driver.findElement(By.xpath(subMenu_xPath)).click();;

	}
	
	
	
}
