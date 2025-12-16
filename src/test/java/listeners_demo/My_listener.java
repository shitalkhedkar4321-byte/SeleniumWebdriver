package listeners_demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class My_listener implements ITestListener {

	public  void onStart(ITestContext context) {
	    System.out.println("onStart.........");
	  }
	
	 public  void onTestStart(ITestResult result) {
		 System.out.println("onTestStart..........");		  }
	
	  public  void onTestSuccess(ITestResult result) {
		  System.out.println("onTestSuccess...........");		  }
	
	  public  void onTestFailure(ITestResult result) {
		  System.out.println("onTestFail...........");		  
		  }
	
	  public  void onTestSkipped(ITestResult result) {
		  System.out.println("onTestskipped..........");		  
		  }
	  public  void onFinish(ITestContext context) {
		  System.out.println("onTestFinish...........");		  
		  }
	
	
	
	
	
	
	
	
}
