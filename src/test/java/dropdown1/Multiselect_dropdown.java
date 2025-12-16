package dropdown1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiselect_dropdown {

	public static void main(String[] args)
	{
		 WebDriver driver=new ChromeDriver()	;
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 driver.get("https://vinothqaacademy.com/drop-down/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize()	;
		 
		 
		WebElement selec = driver.findElement(By.cssSelector("span.select2-selection.select2-selection--multiple"));		
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", selec);
		js.executeScript("arguments[0].click();", selec);
		//driver.findElement(By.cssSelector("span.select2-selection.select2-selection--multiple")).click()	;
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
