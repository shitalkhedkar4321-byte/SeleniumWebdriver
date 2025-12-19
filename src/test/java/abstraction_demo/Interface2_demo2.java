package abstraction_demo;

public interface Interface2_demo2 
{
	 String a="welcome";
	 int c=100;
	 void ab();
	 default void method1()
	 {
		 System.out.println("This is default method...default"); 
	 }
	
	 static void method2()
	 {
		 System.out.println("This is static method...static"); 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
