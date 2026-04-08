package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//Arraylist: can access duplicate values
		// Arraylist, linkedlist, vector - implementing list interface
		// u can access and insert any value in any index
		
		ArrayList<String> a = new ArrayList<String>();
		
		// add element
		a.add("Hi");
		a.add("Maha");
		
		// we can add element to a particular index
		a.add(0, "Lakshmi");
		a.add(3,"Maha");
		
		// we can remove ele with an index
//		a.remove(2);
		
		//we can check if the arraylist contains an ele or not
		System.out.println(a.contains("Maha")); //it return true of false
		
		System.out.println(a);
		
		System.out.println(a.indexOf("Maha")); //it return fist occurence of "Maha"
		System.out.println(a.isEmpty()); // it return true or false
		
		System.out.println(a.size()); //returns size of an array

	}

}
