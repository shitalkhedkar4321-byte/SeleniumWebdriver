package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseId_Locator {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//open Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//userName
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		username.sendKeys("shital");
		Thread.sleep(1000);
		
		//password
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("Sk@9766");
		
		//Login button
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
