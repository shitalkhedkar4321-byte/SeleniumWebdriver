package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//website
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize()	;
		
		Actions act=new Actions(driver);
		WebElement ab1 = driver.findElement(By.id("rightclick"));
		//right click action
		act.contextClick(ab1).build().perform();
		
		driver.findElement(By.id("dblclick"));
		act.doubleClick().build().perform();
		
		WebElement first = driver.findElement(By.xpath("//div[contains(text(),'Drag Me')]"));
		WebElement second = driver.findElement(By.xpath("//div[contains(text(),'Drop Here')]"));
		act.dragAndDrop(first, second).perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
