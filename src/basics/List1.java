package basics;

import java.util.ArrayList;
import java.util.*;

public class List1 {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("luffy");
		li.add(1);
		li.add("java");
		li.add(45);
		
		
		System.out.println("display :"+li);
		
		li.add("manu");
		System.out.println("acces all the data:");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		  
		

	}

}
