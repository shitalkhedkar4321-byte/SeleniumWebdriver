package broken_link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Broken_link_demo1 {

	public static void main(String[] args) throws IOException  {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
				
		WebDriver driver=new ChromeDriver(options)	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize()	;
		System.out.println(driver.getTitle());
		
		//1.capture href attribute for each link
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
		//2.check href having some value or not
		int noofbrokenlink=0;
		for(WebElement linkElement:links)
		{
			@Nullable
			String hrefvalue = linkElement.getAttribute("href");
			if(hrefvalue==null||hrefvalue.isEmpty())
			{
				System.out.println("href value is null or empty hence not possible to check value");
				continue; //it will skip the current value and continue the loop
			}
			//3.hit url to server : string should be in URL format 
			try
			{
			URL linkurl=new URL(hrefvalue);//converted href value from string to url format
			HttpURLConnection conn = (HttpURLConnection)linkurl.openConnection();//open connection to server
			//it return some connection and its store in conn
			conn.connect(); //connect to server and send request to the serevr
			if(conn.getResponseCode()>=400 )  //get status code
			{
				System.out.println("Broken link=====>"+hrefvalue); //print broken link
				noofbrokenlink++;
			}
			else {
				System.out.println("Not a broken link=====>"+hrefvalue);
			}}
			catch (Exception e) {
				
			}
		}
		System.out.println("No of broken links:"+noofbrokenlink);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
