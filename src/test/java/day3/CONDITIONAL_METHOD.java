package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CONDITIONAL_METHOD {

	public static void main(String[] args) throws InterruptedException 
	{

		  WebDriver driver = new ChromeDriver();
	        /*driver.get("https://demo.nopcommerce.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(1000);
	        
	        //isDisplayed()
	        WebElement  display = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	        System.out.println("Display status of logo  :"+display.isDisplayed());
	        
	        Thread.sleep(2000);
	        */
	        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	        driver.manage().window().maximize();
	        Thread.sleep(1000);
	        
	        //isEnabled
	        WebElement check_status = driver.findElement(By.id("FirstName"));
	        System.out.println("is enabled status: "+check_status.isEnabled());
		
		    //isSelected()
	        WebElement sel_male = driver.findElement(By.xpath("//input[@id='gender-male']"));
	        WebElement sel_female = driver.findElement(By.xpath("//input[@id='gender-female']"));

	        
	        System.out.println("Check the selection status before selection..... ");
	        System.out.println(sel_male.isSelected());
	        System.out.println(sel_female.isSelected());

	        sel_male.click();
	        System.out.println("Check the selection status After selection of Male radio button..... ");
	        System.out.println(sel_male.isSelected());
	        System.out.println(sel_female.isSelected());
		
		
		
		
	}

}
