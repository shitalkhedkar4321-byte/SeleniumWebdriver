package keyboard_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_link_in_new_tab {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		
		//website
		driver.get("https://google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com/");
		
		
		
		driver.manage().window().maximize()	;
		
		Actions act=new Actions(driver);
		WebElement about = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		
		act.moveToElement(about).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
