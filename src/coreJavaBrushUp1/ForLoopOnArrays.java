package coreJavaBrushUp1;

public class ForLoopOnArrays {

	public static void main(String[] args) {
		
		
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]+ " Array of index " + i);
		}
		System.out.println("********************");
		int arr2[] = {10, 12, 32, 43, 54};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]+ " Array of index " + i);
		}
		System.out.println("********************");
		
		String str[] = {"Java", "Python", "C++", "C#", "JavaScript"};
		
		for(int i = 0; i< str.length; i++) {
			System.out.println(str[i]+ " Array of index " + i);
		}
		
		System.out.println("********************");
		// topic: Enhanced for loop
		for(String s: str) {
			System.out.println(s);		
		}
	}

}
