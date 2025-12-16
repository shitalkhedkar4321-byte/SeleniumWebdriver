package pom_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
	WebDriver driver;
	//constructor 
	Login_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By username=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By button=By.xpath("//button[@type='submit']");


	//Action methods
	public void setUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void setpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLogin()
	{
		driver.findElement(button).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
