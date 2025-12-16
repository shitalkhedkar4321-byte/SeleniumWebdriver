package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Statictable_hw {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		
		//Choose departure city
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='fromPort']"));
		dropdown.click();
		Select fromCity=new Select(dropdown);
		fromCity.selectByValue("São Paolo");
		
		//choose destination city 
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		dropdown2.click();
		Select toCity=new Select(dropdown2);
		toCity.selectByValue("Cairo");
		
		//click on button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//total rows
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		int rows = allRows.size();
		System.out.println("Total rows: " + rows);
		
		//Total columns
		int columns = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th")).size();
		System.out.println("Total columns: " + columns);
		
		//table all data
		/*for(int r=1; r<=rows; r++)
		{
		    for(int c=1; c<=columns; c++)
		    {
		        String value = driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+r+"]/td["+c+"]")).getText();

		        System.out.print(value + " || ");
		    }
		    System.out.println();
		}*/
System.out.println("-----------------------------------------------------------------------------------------------------");
		//total price
		/*double total = 0;

		for(int r = 1; r <= rows; r++)
			{
			WebElement priceText = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[" + r + "]/td[6]"));

			String price = priceText.getText();  // "$472.56"
			System.out.println(price);

			// remove $, convert to double
			double priceValue = Double.parseDouble(price.replace("$", "").trim());//priceText.replace("$", "") ---This removes the $ symbol.(replace dollar with blank space)
			//.trim()....................This removes the extra spaces from the beginning or end.
			//Double.parseDouble()..........Now the cleaned string is converted into a double number.


			total = total + priceValue;
}*/
			//select cheapest flight
		//1. Capture all prices
		List<WebElement> priceElements = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[6]"));

		double lowest = Double.MAX_VALUE; //
		int lowestRow = -1;

		//2. Loop to find lowest price
		for (int i = 1; i <= priceElements.size(); i++) {
			String priceText = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[" + i + "]/td[6]")).getText();
			double price = Double.parseDouble(priceText.replace("$", "").trim());

			if (price < lowest)
			{
				lowest = price;
				lowestRow = i;
			}
			}
		
			System.out.println("Lowest Price: " + lowest);
			System.out.println("Row No: " + lowestRow);

		//3. Click Choose button in the same row (assuming Choose button is in column 1)
		WebElement chooseBtn = driver.findElement(By.xpath("//table[@class='table']/tbody//tr//td[1]"));
		chooseBtn.click();

			
		//newe page
		driver.findElement(By.xpath("//input[@name='inputName']")).sendKeys("Shital");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Baner");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("1234");
		WebElement drop=driver.findElement(By.xpath("//select[@name='cardType']"));
		drop.click();
		Select select=new Select(drop);
		select.selectByValue("dinersclub");
		driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("112938234");
		driver.findElement(By.xpath("//input[@name='creditCardMonth']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='creditCardYear']")).sendKeys("2025");
		driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("Shital Khedkar");
		driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
 
		WebElement result = driver.findElement(By.cssSelector("div[class='container hero-unit'] h1"));
		if(result.equals("Thank you for your purchase today!"))
		{
			System.out.println("You have booked a flight successfully..........!!");
		}
		
		
		
		



		

		
		











				








		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
