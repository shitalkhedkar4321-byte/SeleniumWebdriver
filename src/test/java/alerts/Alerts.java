package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//normal alert with ok button
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()	;
		Alert myalert = driver.switchTo().alert();		
		System.out.println(myalert.getText());
		myalert.dismiss();*/
		
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().accept()	;
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss()	;*/
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click()	;
		Thread.sleep(1000);
		Alert al=driver.switchTo().alert();
		al.sendKeys("welcome");
		al.accept();
		
		
		
		
		
		
		
		
		

	}

}
