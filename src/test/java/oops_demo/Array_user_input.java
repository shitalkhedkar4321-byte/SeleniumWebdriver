package oops_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_user_input {

	public static void main(String[] args) 
	{
		ArrayList<Integer> val=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		//Enter array size
		System.out.println("Enter size of Array: ");
		int n=sc.nextInt();		
		
		for(int x=0;x<n;x++)
		{
			System.out.println("Enter value: ");
			val.add(sc.nextInt());
		}
		
		System.out.println("Array list: "+val);
		
		
		
		
		
		
		
		
	}

}
