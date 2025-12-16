package day1;

//import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class MyfirstDemo {

	public static void main(String[] args) {
		// launch the browser
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Shital\\Downloads\\ChromeSetup.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		String  act_title=driver.getTitle();
	if(act_title.equals("Online Shopping"))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	
	//close browser
	//driver.quit();
			
	}

}
