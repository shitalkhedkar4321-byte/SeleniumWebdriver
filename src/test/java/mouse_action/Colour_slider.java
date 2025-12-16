package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Colour_slider {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//website
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize()	;
		
		//iframe
		WebElement frmae_element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frmae_element);
		Actions act=new Actions(driver);
		//1st colour
		WebElement first_clr=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		System.out.println("First element location: "+first_clr.getLocation());
		//2nd colour
		WebElement second_clr=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		System.out.println("Second element location: "+second_clr.getLocation());
		act.dragAndDropBy(second_clr, 800, 115).perform();
		System.out.println("Second element location after drag and drop: "+second_clr.getLocation());
		//3rd colour
		WebElement third_clr=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]"));
		System.out.println("Third element location: "+third_clr.getLocation());
		act.dragAndDropBy(third_clr, 130, 159).perform();
		System.out.println("Third element location after drag and drop: "+third_clr.getLocation());
		
		//Actions class too perform mouse actions
		
		act.dragAndDropBy(first_clr, -200, 71).perform();
		System.out.println("First element location after drag and drop: "+first_clr.getLocation());
		act.dragAndDropBy(second_clr, -100, 115).perform();
		System.out.println("Second element location after drag and drop: "+second_clr.getLocation());
		act.dragAndDropBy(third_clr, -50, 159).perform();
		System.out.println("Third element location after drag and drop: "+third_clr.getLocation());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
