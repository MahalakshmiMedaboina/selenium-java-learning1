package arraysConcept;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		//way-1
		int a[][] = new int[2][3]; // 2D array
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		//way-2
		int b[][] = {{1, 2, 3}, {4, 5, 6}};
		
		System.out.println(a[0][0]);
		
		System.out.println(b[1][2]);
		
		
		

	}

}
