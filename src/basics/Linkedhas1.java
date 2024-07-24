package basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Linkedhas1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String > mo=new LinkedHashMap<Integer, String>();
		mo.put(1,"abcd");
		mo.put(3,"nimmy");
		mo.put(5, "null");
		
		
		Set mp=mo.entrySet();
		Iterator itr=mp.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();

System.out.println(entry.getKey()+":"+entry.getValue());

	}

}
}