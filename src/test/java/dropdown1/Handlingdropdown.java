package dropdown1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Admin:admin123@opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click()	;
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click()	;
		
		//
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		 List<WebElement> options = driver.findElements(By.xpath("//div[@class='oxd-select-option']/span"));
		System.out.println("Total number of element: "+options.size());
		
		//printing options
		for(WebElement op:options)
		{
			System.out.println(op.getText());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
