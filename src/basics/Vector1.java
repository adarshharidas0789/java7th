package basics;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		List <Integer> li1=new  Vector<Integer>();
		li1.add(24);
		li1.add(23);
		li1.add(12);
		li1.add(12);
		
	Iterator itr=li1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
		

	}

}
