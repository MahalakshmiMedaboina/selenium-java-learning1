package collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// Hashset, linkedset, treeset immplements set interface
		// doesnt accept duplicate values
		 	
		// there is no guarantee that elements will be stored in order. Random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("UK");
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		

	}

}
