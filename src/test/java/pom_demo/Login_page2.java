package pom_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page2 {
	WebDriver driver;
	//constructor 
	Login_page2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	/*By username=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By button=By.xpath("//button[@type='submit']");*/
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement userName;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath = "//button[@type='submit']") WebElement button;
	
	
	//Action methods
	public void setUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
