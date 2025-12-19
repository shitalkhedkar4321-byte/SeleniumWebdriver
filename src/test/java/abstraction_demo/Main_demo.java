package abstraction_demo;

public class Main_demo extends Addition_class  implements Shape_interface, Interface2_demo2 {

	public static void main(String[] args) 
	{
		Addition_class da=new Addition_class()	;
		da.data(21);
		da.data2(3, 4);
		
		
		
		
		Main_demo inter=new Main_demo();
		inter.circle();
		inter.square();
		Shape_interface.rectangle();
		System.out.println(inter.length);
		System.out.println(inter.width);
		
		inter.ab();
		inter.method1();
		Interface2_demo2.method2();
		
		System.out.println(inter.a);
		System.out.println(inter.c);

		
		
		
		
	}

	@Override
	public void circle() {
		System.out.println("This is abstractt method...");		
	}

	@Override
	public void ab()
	{
		System.out.println("This is abstractt method...abstractt...abstractt");		
	
	}

}
