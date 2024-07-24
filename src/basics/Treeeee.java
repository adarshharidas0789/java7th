package basics;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class Treeeee {

	public static void main(String[] args) {
		TreeMap<Integer,String > mo=new TreeMap<Integer, String>();
		mo.put(1,"abcd");
		mo.put(3,"bacd");
		mo.put(5, "null");
		
		
		Set mp=mo.entrySet();
		Iterator itr=mp.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();

System.out.println(entry.getKey()+":"+entry.getValue());

	}
	}
}
