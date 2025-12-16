package headless_demo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_mode {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions()	;
		options.setAcceptInsecureCerts(true); //accept ssl certificate
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options)	;
	 	
		//website
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize()	;
		 System.out.println(driver.getTitle());
		 
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 File target=new File(System.getProperty("user.dir")+"\\screenShots\\ssl_area.png");
		 source.renameTo(target);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
