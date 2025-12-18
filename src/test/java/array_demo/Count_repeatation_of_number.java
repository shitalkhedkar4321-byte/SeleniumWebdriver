package array_demo;

import java.util.Arrays;
import java.util.Scanner;

public class Count_repeatation_of_number {

	public static void main(String[] args) 
	{
		int count=0;
		int val[]= {12,232,98,202,654,876,232,90,231,232};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int userval=sc.nextInt();
		System.out.println("Entered value is: "+userval);
		for(int x: val)
		{
			if(x==userval)
			{
				count++;
			}
		}
		System.out.println("count of "+userval+" is: "+count);
		
		//print array
		System.out.println(Arrays.toString(val));
		Arrays.sort(val);
		System.out.println("After soting array is: "+Arrays.toString(val));
		
		
		
		
		
		
	}

}
