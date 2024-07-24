package basics;
import java.util.*;
public class Arrayqueau {

	public static void main(String[] args) {
		ArrayDeque<String> pq=new ArrayDeque<String>();
		pq.add("ada");
		pq.add("ad");
		pq.add("12");
		
		for(String data:pq) {
			System.out.println(data);
		}
pq.addFirst("aliyan");
System.out.println(pq);

pq.poll();
System.out.println(pq);

pq.pollFirst();
System.out.println(pq);

pq.pollLast();
System.out.println(pq);

System.out.println(pq.pollFirst());
System.out.println(pq.pollLast());

	}

}
