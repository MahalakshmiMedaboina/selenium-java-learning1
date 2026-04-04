package arraysConcept;

public class ArraysDemo1 {

	public static void main(String[] args) {

//		a var can store one value at once, but if we want to store many values of same type then we can use array.
		
		// Array: A container which stores multiple values of same data type. once it is created it is fixed.
		
		//Way-1
		
		int a[] = new int[5]; // declares an array & allocates memory for the values
		a[0] = 2; 
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4; // Initialized values into that array
				
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]); // retrieves values present in this array
		}
	}

}

