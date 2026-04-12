package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Hi");
		hm.put(1, "Hello");
		hm.put(2, "Maha");
		
//		hm.remove(1);
		
		System.out.println(hm.get(2));
		
		Set sn = hm.entrySet(); //stores values in set
		System.out.println(sn);
		
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			
			// lets print key & value seperate
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
			
		}

	}

}
