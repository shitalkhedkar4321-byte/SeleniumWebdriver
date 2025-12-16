package headless_demo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Enable_extensions {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions()	;
		File file=new File("C:\\Users\\Shital\\Downloads\\crx\\SelectorsHub-Chrome-Web-Store.crx");
		options.addExtensions(file);
		
		
		WebDriver driver=new ChromeDriver(options)	;
		driver.get("https://google.com/");
		driver.manage().window().maximize()	;
		 System.out.println(driver.getTitle());
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
