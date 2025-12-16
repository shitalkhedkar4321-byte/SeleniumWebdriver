package js_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args)
	{
			WebDriver driver=new ChromeDriver()	;
	 		
			//website
			driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
			driver.manage().window().maximize()	;
		
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.body.style.zoom='20%'");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
