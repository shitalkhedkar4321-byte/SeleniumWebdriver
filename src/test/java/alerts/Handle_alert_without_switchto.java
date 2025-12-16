package alerts;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_alert_without_switchto {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()	;
		@Nullable
		Alert myalert = wait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
