package dropdown1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_demo {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//launch
		//driver.get("https://www.w3schools.com/bootstrap5/bootstrap_dropdowns.php");
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		//select single option 
		//driver.findElement(By.xpath("//div[3]//button[1]")).click()	;
		
		//path
		WebElement ele = driver.findElement(By.id("react-select-4-input"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
