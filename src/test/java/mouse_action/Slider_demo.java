package mouse_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_demo {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//website
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize()	;
		
		//iframe
		WebElement frmae_element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frmae_element);
		
		//capture min location
		WebElement min_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		//check current position
		System.out.println("Default location of slider: "+min_slider.getLocation()	);
		
		//its mouse action hence use Actions class
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 1000, 0).perform();
		System.out.println("location of slider after moving: "+min_slider.getLocation()	);

		//capture max location
		WebElement	maxslider =driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover']"));
		act.dragAndDropBy(maxslider, -100, 4);
		System.out.println("location of slider after moving from max to min: "+min_slider.getLocation()	);

		
		
		
		
		
		
	}

}
