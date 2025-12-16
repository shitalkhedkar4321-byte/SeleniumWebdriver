package dropdown1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
	Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println("Size of result: "+list.size());
		for ( int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium"))
			{
				list.get(i).click();
				break;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
