package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		// add element
		a.add("Hi");
		a.add("Maha");
		
		// we can add element to a particular index
		a.add(0, "Lakshmi");
		
		// we can remove ele with an index
//		a.remove(2);
		
		//we can check if the arraylist contains an ele or not
		System.out.println(a.contains("Maha")); //it return true of false
		
		System.out.println(a);

	}

}
