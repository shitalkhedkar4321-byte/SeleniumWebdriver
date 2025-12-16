package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Cartopen {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//id 
		boolean act_element = driver.findElement(By.id("app")).isDisplayed();
		System.out.println(act_element);
		
		
		//linkText
		//driver.findElement(By.linkText("Details")).click();
		

	}

}
