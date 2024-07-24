package basics;

import java.util.*;

public class Staack {

	public static void main(String[] args) {
	Stack sc=new Stack();
	sc.push("adarsh");
	sc.push(25);
	sc.push("anna");
	sc.push("achu");
	
	for(int i=0;i<sc.size();i++) {
		System.out.println("elements ar:"+sc.get(i));
	}
System.out.println("top list are"+sc.peek());
sc.pop();
System.out.println("remove top element"+sc);
}

}
