package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//launch
		driver.get("https://collection.volvocars.com/en/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//tag+id
		driver.findElement(By.cssSelector("input[name=Business]")).click();
		
		driver.findElement(By.cssSelector(".search-wrap")).click();
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("VW");
		Thread.sleep(3000);
		
		WebElement except_var = driver.findElement(By.cssSelector(".instantSearchResourceElement"));
		 // Scroll to element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", except_var);
        Thread.sleep(500);  // small pause for animation
        // Click using JavaScript (fixes non-interactable problems)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", except_var);
        except_var.click();
		
		
		
		
	}

	
}



