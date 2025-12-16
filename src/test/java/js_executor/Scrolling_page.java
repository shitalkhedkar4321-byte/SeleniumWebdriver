package js_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_page {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver()	;
 		
		//website
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize()	;
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1. scroll down page by pixel number
//		js.executeScript("window.scrollBy(0,3000)");
//		//capture the value how much our scroll bar is moved
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//		//we are scrolling page vertically hence we are using Yaxis
//		
//		WebElement poland=driver.findElement(By.xpath("(//table[@class='two-column td-image'])[2]//tbody//tr//td[contains(text(),'Poland')]"));
//		js.executeScript("arguments[0].scrollIntoView()", poland);
//		System.out.println(js.executeScript("return window.pageYOffset;" ));
		
		//scroll till end of the page 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//initial position 
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
