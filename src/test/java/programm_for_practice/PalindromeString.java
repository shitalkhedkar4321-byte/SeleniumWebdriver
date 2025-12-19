package programm_for_practice;

public class PalindromeString  {

	public static void main(String[] args)
	{
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("Given string is palindrome");
			
			
		}
		else {
		System.out.println("Not a Palindrome string ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
