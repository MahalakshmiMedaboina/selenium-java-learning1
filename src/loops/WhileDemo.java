package loops;

public class WhileDemo {

	public static void main(String[] args) {
		
		// while loop repeatedly executes a block of code as long as the condition is true.
		// print 1 to 5 using while loop

		int i = 1;		
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("**************************");
		
		int j = 5;
		while(j>0) {
			System.out.println(j);
			j--;
		}
	}

}
