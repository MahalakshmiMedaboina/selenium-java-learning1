package coreJavaBrushUp1;

import java.util.ArrayList;

public class FoorLoopArrayConditional {

	public static void main(String[] args) {
		
		int arr[] = {1, 23, 434, 234};
		
		// enhanced for loop
		for(int a:arr) {
			System.out.println(a);
		}
		
		System.out.println("*************************************");
		
		// WAP: lets print multiples of 2
		int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i<arr2.length; i++) {
			if(arr2[i]%2 == 0) {
			System.out.println(arr2[i] + " is multiple of 2"); 
			}else {
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		System.out.println("*************************************");
		
		// WAP: print the 1st multiple of 2 instead of iterating it the end.
		
		for(int j = 0; j<arr2.length; j++) {
			if(arr2[j]%2==0) {
				System.out.println(arr2[j] + " is multiple of 2");
				break;
			}else {
				System.out.println(arr2[j] + " is not multiple of 2");
			}
		}
		
		System.out.println("*************************************");
		
		// WAP: to add values dynamically into array using ArrayList
		
		ArrayList<String> a = new ArrayList<String>();
		// create obj of the class  - then we can access methods with obj like this [object.method]
		
		a.add("Maha"); // use add to add values dynamically
		a.add("Lakshmi");
		a.add("Shivani");
		
		System.out.println(a.get(1));  // to fetch value using array index
		
		a.remove(2);  //remove an element from arrayList
		
		
	}

}
