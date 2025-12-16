package grouping_demooo;

import org.testng.annotations.Test;

public class Signup {
	
	@Test(priority = 1,groups = {"sanity","regression"})
	void signupnByEmail()	
	{
		System.out.println("This is signup by Email");
	}
	@Test(priority = 2, groups = {"sanity","regression"})
	void signupByFacebook()	
	{
		System.out.println("This is signup by Facebook");
	}
	@Test(priority = 3,groups = {"sanity","regression"})
	void signupByTwitter()	
	{
		System.out.println("This is signup by Twitter");
	}
	
	
	
	
	
	
	
	
	
	
	
}
