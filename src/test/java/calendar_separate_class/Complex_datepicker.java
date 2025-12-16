package calendar_separate_class;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complex_datepicker {

	static Month convertMonth(String month)
	{
		HashMap<String, Month> monthMap=new HashMap<String, Month>();
		 monthMap.put("January", Month.JANUARY);
		Month vmonth=monthMap.get(month);
		if(vmonth==null)
		{
			System.out.println("Invalid month...");
		}
		return vmonth;
	}
	
	
	
	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//website
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize()	;
		
		//datepicker expected data
//		String month="May";
//		String year="2026";
//		String date="20";
//		
		driver.findElement(By.xpath("//div[@class='date-picker-box']")).click();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
