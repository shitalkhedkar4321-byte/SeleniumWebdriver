package day3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_cmd {

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{

		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//driver.navigate().to("https://www.youtube.com/watch?v=zc5L1Q_voSE&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR&index=29");
		
		URL myurl=new URL("https://www.youtube.com/watch?v=zc5L1Q_voSE&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR&index=29");
		driver.navigate().to(myurl);
		driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
