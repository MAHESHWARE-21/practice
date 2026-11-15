package testprogram;

public class Arraysecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a1 = new int[4];
		a1[0] = 12;
		a1[1] = 24;
		a1[2] = 20;
		a1[3] = 29;
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for(int i=0; i<4; i++)
		{
			if(a1[i]>largest)
			{
				secondlargest = largest;
				largest = a1[i];
			}
			else if(a1[i]>secondlargest&&a1[i]!=largest)
			{
				secondlargest = a1[i];
			}
			
		}
		if(secondlargest==Integer.MIN_VALUE)
		{
			System.out.println("Second largest element not found");
		}
		else
		{
			System.out.println("Second largest element found: " +secondlargest);
		}

	}

}
