

import java.util.Arrays;

public class Ana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "act";
		String output = "cat";
		
		if(input.length()!=output.length())
		{
			System.out.println("never anagram");
		}
		else
		{
			char[] c1 = input.toCharArray();
			char[] c2 = output.toCharArray();
			
		 Arrays.sort(c1);
	     Arrays.sort(c2);
	     if(Arrays.equals(c1, c2))
	     {
	    	 System.out.println("It is Anagram");
	     }
	     else
	     {
	    	 System.out.println("It is Not Anagram");
	     }
		
		}
		

	}

}
