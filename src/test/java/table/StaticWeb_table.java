package table;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWeb_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver()	;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		//table: find total number of rows 1)by total number of tr
		int trow = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total number of rows: "+trow);
	
		//table: find total number of rows 2) 
		//it will give all rows count present on web page
		//int count = driver.findElements(By.tagName("tr")).size();
		//System.out.println("count: "+count); //output table row count:19
		
		//table header
		int tcolumn = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();		
		System.out.println("Table header "+tcolumn);
		
		//find particular data
		//String val = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(val);
		
		//read data from all rows and column 
		/*for(int r=2;r<=trow;r++)
		{
			
			for(int c=1;c<=tcolumn;c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();		
				System.out.print(value+" ");
			}
			System.out.println();
		}
		*/
		
		//print book names whose author name is mukesh
		/*for(int r=2;r<=trow;r++)
		{
			String author_name = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(author_name);
			if(author_name.equals("Mukesh"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName+" "+author_name);
			}
		}*/
		
		//print the total price of book
		int totalprice=0;
		for(int r=2;r<=trow;r++)
		
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			System.out.println(price+" ");
			totalprice=totalprice+Integer.parseInt(price);
		}
		System.out.println("Total price= "+totalprice);

		driver.quit();
		
		
	}

}
