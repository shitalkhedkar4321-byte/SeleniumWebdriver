package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_element_handling {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		//launch
		driver.get("https://tutorialsninja.com/demo/");
		//maximize screen 
		driver.manage().window().maximize();
		
		//dynamic element 
		//button -> start to stop 
		driver.findElement(By.xpath("//*[@id='start' or @id='stop'"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
