package calendar_separate_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//website
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize()	;
		
		//datepicker expected data
		String month="May";
		String year="2026";
		String date="20";
		
		driver.findElement(By.xpath("//input[@name='SelectedDate']")).click();
		
		//select month
		WebElement select_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-month']"));
		select_month.click();
		Select expected_month=new Select(select_month);
		expected_month.selectByVisibleText(month);
		//select year
		WebElement select_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[@class='ui-datepicker-year']"))	;
		select_year.click();
		Select expected_year=new Select(select_year);
		expected_year.selectByVisibleText(year);
		
		List<WebElement> expected_date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for(WebElement dt:expected_date)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
