package screenshot_demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_area_screenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
	 	
		//website
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize()	;
		 
		
		WebElement area = driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", area);
		
		File sourcefile=area.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenShots\\spe_area.png");
		sourcefile.renameTo(targetfile);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
