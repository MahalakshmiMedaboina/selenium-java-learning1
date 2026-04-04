package loops;

public class NestedForLoop {

	public static void main(String[] args) {
//		System.out.println("*******nested for loop************");
		
//		for(int i=1; i<=3;i++) {
//			System.out.println("####outer loop started");
//			
//			for(int j=1; j<=4;j++) {
//				System.out.println("inner loop started");
//			}
//			System.out.println("outer loop finished###");
//		}
		
//		System.out.println("******pattern 1******************");
		
		/* print: 1 2 3 4

				5 6 7

				8 9

				10 */
		
//		int num = 1;
//		// Outer loop controls the rows
//
//		for(int row=4; row>=1; row--) {			
//			
//			// Inner loop prints numbers in each row
//			for(int col=1;col<=row; col++) {
//				System.out.print(num+ " ");
//				num++;
//			}
//			System.out.println(); // move to next line
//		}
//		
		System.out.println("******pattern 2***************");
		
		int num = 1;
		
		for(int row=1; row<=4; row++) {
			
			for(int col=4; col>=row; col--) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
		
	}

}
