package array_demo;

import java.util.Scanner;

public class Sort_array {

	public static void main(String[] args) 
	{

		int val[]= {10,33,9,282,81,9};
		//int search=8;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter calue : ");
		int search=sc.nextInt();
		for(int x:val)
		{
			if(x==search)
			{
				System.out.println("value found...");
				break;
			}else {
				System.out.println("value not found...");
				break;
			}
		}
		
		
		
		
		
		
	}

}
