package testprogram;

import java.util.Arrays;

public class Arrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rollnoA = new int[3];
		rollnoA[0] = 10;
		rollnoA[1] = 20;
		rollnoA[2] = 30;
		
		int[] rollnoB = new int[rollnoA.length];
		
		for(int i=0, j=rollnoA.length-1; i<rollnoA.length; i++,j--)
		{
			rollnoB[j]=rollnoA[i];
		}
		System.out.println(Arrays.toString(rollnoB));
		

	}

}
