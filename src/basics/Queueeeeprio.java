package basics;
import java.util.*;

public class Queueeeeprio {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("ada");
		pq.add("ad");
		pq.add("12");
		
		for(String data:pq) {
			System.out.println(data);
		}
	}

}
