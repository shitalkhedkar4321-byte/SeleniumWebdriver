package testng_demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest_2 {
	WebDriver driver;
	
	@Test(priority=1)
	void openapp()
	{
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://dev.automationtesting.in/");
		  driver.manage().window().maximize()	;
	}
  @Test(priority=2)
   void testlogo ()
  {
	  boolean status = driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
	 System.out.println("logo displayed....."+status);
	 
  }
  @Test(priority=3)
  void login()
  {
	  
  }
  @Test(priority=4)
  void logout()
  {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin")  ;
  }
}
