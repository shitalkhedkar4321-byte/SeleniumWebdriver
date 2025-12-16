package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_handling {

	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

		//select specific check box
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
        //select all check boxes
      List<WebElement> checkbx_select= driver.findElements(By.xpath("//div[@class='form-check form-check-inline']/input[@type='checkbox']"));
      /*for(WebElement checkbx : checkbx_select)
      {
    	  checkbx.click();
      }
      */
      //select last 3 checkboxes
     /* for (int i=checkbx_select.size()-1; i>=4;i--)
      {
    	  checkbx_select.get(i).click();
      }*/
      //select first 3 checkbox
      for(int i=0;i<3;i++)
      {
    	  checkbx_select.get(i).click();
      }
		Thread.sleep(1000);
		
		//if check boxes are selected then unselect those
		
      for(int i=0;i<3;i++)
      {
    	  if(checkbx_select.get(i).isSelected()) {
    	  checkbx_select.get(i).click();
    	  }
      }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
