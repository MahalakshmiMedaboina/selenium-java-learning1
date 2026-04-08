package collections;

import java.util.HashSet;
import java.util.Iterator;

import com.google.common.collect.Iterators;

public class HashSetExample {

	public static void main(String[] args) {
		// Hashset, linkedset, treeset immplements set interface
		// doesnt accept duplicate values
		 	
		// there is no guarantee that elements will be stored in order. Random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("UK"); // this will be ignored, as HashSet will not accept duplicate values.
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//iterators
		Iterator<String> i = hs.iterator();
//		i.next(); //prints a value, if we have 4 values to print then 4times we need to write "next" it increments each time n prints all, 
		
		// To avoid writing many times next, will follow below one
		while(i.hasNext()) { //here hasNext will check it has a value next or not, if not loop will end.
			
			System.out.println(i.next());
		}
	}

}
