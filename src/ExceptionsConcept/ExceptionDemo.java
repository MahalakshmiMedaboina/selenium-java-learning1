package ExceptionsConcept;

//Exceptions : it is a process of handling exceptions.
// why do we use try-catch? to prevent program from crashing.
// 1 try can have multiple exceptions, but catch should be an immediate block of try.

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			int a = 2;
			int b= 0;
			int c = a/b;
			
			System.out.println(c);  // o/p: I catch only Arithmetic exceptions, after finding one exception then next line never executed.
			
//			int arr[] = new int[5];
//			System.out.println(arr[7]);
		}
			
		catch(ArithmeticException ae) {
			System.out.println("I catch only Arithmetic exceptions"); 
		}
		try {
			int arr[] = new int[5];
			System.out.println(arr[7]);
		}
		catch(IndexOutOfBoundsException Ie) {
			System.out.println("I catch only Index out of bound exception");
		}
		catch(Exception e){
			System.out.println("I catched generic exception, for any error it supports.");
		}

	}

}
