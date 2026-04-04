package coreJavaBrushUp1;

public class ArrayConcept {

	public static void main(String[] args) {
		//An array is a variable that can store multiple values of the same type.
		
		// way 1: Array declaration with memory allocation
		
		int[] arr = new int[5]; // declaration and initialization of an array of integers with size 5
		arr[0] = 10; // assigning values to the array
		arr[1] = 20;
		arr[2] = 30;	
		arr[3] = 40;
		arr[4] = 50;
		
		// way 2: Array declaration with initialization of an array of integers with values
		int arr2[] = {10, 20, 30, 40, 50}; 
		
		// way 3: Array declaration with initialization of an array of strings with values
		String[] arr3 = {"Rahul", "Shetty", "Academy"};
		
		// way 4: Array declaration with initialization of an array of characters with values
		char[] arr4 = {'R', 'S', 'A'};
		
		// way 5: Array declaration with initialization of an array of booleans with values
		boolean[] arr5 = {true, false, true};
		
		System.out.println(arr2[2]); // print the value at index 2 of arr2 array

	}

}
