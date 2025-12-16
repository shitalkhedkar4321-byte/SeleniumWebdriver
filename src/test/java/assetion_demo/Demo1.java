package assetion_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	void testTile()
	{
		String exp_title="Opencart";
		String act_title="Openshop";
	
		/*if(exp_title.equals(act_title))
		{
			System.out.println("Test passed...");
		}
		else
		{
			System.out.println("Test failed...");
		}*/
	
		Assert.assertEquals(exp_title, act_title);
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
