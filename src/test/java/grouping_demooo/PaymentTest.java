package grouping_demooo;

import org.testng.annotations.Test;

public class PaymentTest {
	@Test(priority = 1, groups = {"regression"})
	void paymentInRupees()
	{
		System.out.println("Payment in Rupees");
	}
	@Test(priority = 2, groups = {"regression"})
	void paymentInDollar()
	{
		System.out.println("Payment in Dollar");
	}
	@Test(priority = 3, groups = {"regression"})
	void paymentInGold()
	{
		System.out.println("Payment in Gold");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
