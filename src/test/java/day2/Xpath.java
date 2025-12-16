package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//launch
		driver.get("https://tutorialsninja.com/demo/");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("insta360");
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("insta360");
		
		//driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		/*boolean eleme = driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
		System.out.println(eleme);
		String gettex = driver.findElement(By.xpath("//*[text()='Featured']")).getText();
		System.out.println(gettex);
		if (gettex.equals(gettex)) 
		{System.out.println("condition satisfied");
			
		}*/
		
		//driver.findElement(By.xpath("//input[@placeholder='Search']"));
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("ABC");
		
		
		
		
		
		
		
		
		
		

	}

}
