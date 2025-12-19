package programm_for_practice;

public class Duplicate_num_frm_array {

	public static void main(String[] args)
	{
		int a[]= {2,32,6,2,32,7,32};
		
		for (int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate number is: "+a[i]);
					break;
				}
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
