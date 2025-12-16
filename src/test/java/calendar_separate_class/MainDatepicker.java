package calendar_separate_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
	
	
public class MainDatepicker {
	static void datemonthandyear_future(WebDriver driver, String month, String year, String date)
	{
		while(true)
		{
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(current_month.equals(month) && current_year.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();		//next	button
																								 
			
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement dt:dates) 
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
				}
		}
		
	}
	static void datemonthandyear_past(WebDriver driver, String month, String year, String date)
	{
		while(true)
		{
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if(current_month.equals(month) && current_year.equals(year))
			{
				break;
			}
			
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();				//previous button																					//previous button
			
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement dt:dates) 
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
				}
		}
		
	}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//website
		driver.get("https://jqueryui.com/datepicker/");
		
		//iframe
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//datepicker expected data
		String month="May";
		String year="2026";
		String date="20";
		
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).click();
		
		
		datemonthandyear_future( driver,  month,  year,  date);
		
		//datemonthandyear_past( driver,  month,  year,  date);

		
		
		
		
		
		
		
		
	}

}
