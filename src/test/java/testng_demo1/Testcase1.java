package testng_demo1;

import org.testng.annotations.Test;

//open App-- login--logout
public class Testcase1 
{
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Opening application.....");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Login to application....");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from application...");
	}
	
	
	
	
	
	
	
	
	
	
	
}
