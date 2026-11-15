package testprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List L1 = new ArrayList();
		L1.add(12);
		L1.add(23);
		L1.add(26);
		
		Iterator I1 = L1.iterator();
		while(I1.hasNext())
		{
			System.out.println(I1.next());
		}
		System.out.println(L1);

	}

}
