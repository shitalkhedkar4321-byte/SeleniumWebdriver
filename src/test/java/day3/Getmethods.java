package day3;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		//launch
		driver.get("https://tutorialsninja.com/demo/");
		//maximize screen 
		driver.manage().window().maximize();
		
		/*
		 * String title = driver.getTitle();
		System.out.println("Title of webPage :"+title);
		
		@Nullable
		String pageSour = driver.getPageSource();		
		System.out.println(pageSour);*/
		
		
		driver.findElement(By.xpath("//a[text()='Qafox.com']")).click();
		
		Set<String> wd11=driver.getWindowHandles();
		System.out.println(wd11);
		
		
		//driver.quit();
		
		
		
		
		
	}

}
