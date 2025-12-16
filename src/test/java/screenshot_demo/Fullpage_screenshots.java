package screenshot_demo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fullpage_screenshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
 	
		//website
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize()	;
		
		//full page screenshots
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenShots\\fullpage.png");
		sourcefile.renameTo(targetfile);
		
		
		
		
		
		
		
		
		
		
		
	}

}
