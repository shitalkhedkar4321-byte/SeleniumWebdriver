package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//explicit wait declaration
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	    driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
