package oops_demo;

import java.util.ArrayList;

public class Array2_demo2 {

	public static void main(String[] args) 
	
	{
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("Hello");
		ar.add(123);
		ar.add(12.23);
		ar.add('C');
		System.out.println("Array: "+ar);
		System.out.println("Size of array: "+ar.size());
		ar.add(3,"Selenium");
		System.out.println("Array after adding new value: "+ar);
		System.out.println(ar.get(2));
		
		
		
		
		
		
		
		
		
		
	}

}
