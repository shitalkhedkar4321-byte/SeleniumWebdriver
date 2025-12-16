package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_action {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//website
		driver.get("https://vinothqaacademy.com/mouse-event/?utm_source=chatgpt.com");
		driver.manage().window().maximize()	;
		
		
		WebElement video = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Free Complete QA Video Courses')]"));
		Actions act=new Actions(driver);
		//act.moveToElement(video).build().perform();
		Thread.sleep(2000);
		WebElement self_video = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Self Paced Video Course')]"));
		act.moveToElement(video).moveToElement(self_video).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
