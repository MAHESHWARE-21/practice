package testprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<String,Integer> M1 = new HashMap<String,Integer>();
		M1.put("pa",1);
		M1.put("kk", 2);
		M1.put("cc", 3);
		
		for(String S1: M1.keySet())
		{
			System.out.println(S1);
		}
		for(Entry<String,Integer> E1 : M1.entrySet())
		{
			System.out.println(E1);
		}
		
		
	}

}
