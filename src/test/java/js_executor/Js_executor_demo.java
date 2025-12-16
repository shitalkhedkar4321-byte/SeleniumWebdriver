package js_executor;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_executor_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
 		
		//website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");
		 
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','John')", name);
		
	WebElement	email=driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].setAttribute('value','snk@gmail.com')", email);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
