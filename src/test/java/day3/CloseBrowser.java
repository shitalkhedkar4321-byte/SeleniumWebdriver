package day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//img[\r\n"
				+ "    contains(@class, '_2puWtW')\r\n"
				+ "    and contains(@class, '_3a3qyb')\r\n"
				+ "    and contains(@src, '5f2ee7f883cdb774.png')\r\n"
				+ "]")).click();		
		
		Set<String> winIds = driver.getWindowHandles();
		
		List<String> listid=new ArrayList<String>(winIds);
		
		for(String loopid:listid)
		{
			@Nullable
			String title = driver.switchTo().window(loopid).getTitle();
			if(title.equals("https://www.flipkart.com/mobile-phones-store?param=4111&fm=neo%2Fmerchandising&iid=M_e7600780-2b95-4bb2-8a34-05f9912c7958_1_X1NCR146KC29_MC.AH1NTIJZ241Z&cid=AH1NTIJZ241Z"))
			{
				System.out.println(driver.getCurrentUrl());

			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
