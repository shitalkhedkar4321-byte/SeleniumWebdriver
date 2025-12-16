package upload_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_filesDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
 		
		//website
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize()	;
		
		//driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("C:\\Users\\Shital\\Downloads\\KPIT\\00148576_Relieving_Letter_03122025__182834.pdf");
		//multiple file upload
		
		String file1="C:\\Users\\Shital\\Downloads\\KPIT\\00148576_Relieving_Letter_03122025__182834.pdf";
		String file2="C:\\Users\\Shital\\Downloads\\KPIT\\Shital_Khedkar.pdf";
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys(file1+"\n"+file2);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
