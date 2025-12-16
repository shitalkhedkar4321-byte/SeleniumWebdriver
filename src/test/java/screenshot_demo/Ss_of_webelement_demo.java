package screenshot_demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss_of_webelement_demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
	 	
		//website
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize()	;
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		 	File source = logo.getScreenshotAs(OutputType.FILE);
		 	File target=new File(System.getProperty("user.dir")+"\\screenShots\\elementss.png");
		 	source.renameTo(target);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
