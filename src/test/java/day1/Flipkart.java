package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//className
		List<WebElement> element = driver.findElements(By.className("ecs1XG"));
		System.out.println("Total number of header links: "+element.size());
		
		
		//className
//		List<WebElement> listCount = driver.findElements(By.className("nav-ftr-links-two-column"));
//		System.out.println("Total number of list Count : "+listCount.size());
		
		//tagName
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("Total available links:"+links.size()); 
//		for(WebElement x: links)
//		{
//			System.out.println("total links :: "+x);
//		}
		
		
		//Count all images on a site
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:"+images.size());
	
	
	
	
	
	
	}

}
