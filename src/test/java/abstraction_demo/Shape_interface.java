package abstraction_demo;

public interface Shape_interface 
{
		int length=10; //variables are static and final
		int width=13;
		

		default void square()
		{
			System.out.println("This is default method...");
		}
		
		static void rectangle()
		{
			System.out.println("This is Static method...");
		}
		void circle();  //abstract method










}
