package polymorphismConcept;

public class MethodOverloading {
	
	public void getData(int a) {
        System.out.println(a);
    }

    public void getData(String a) {
        System.out.println(a);
    }

	public static void main(String[] args) {
		
		/*Rules for Overloading -
		 * - The **number of arguments** is different.
		- The **data type of arguments** is different.
		- The **order of arguments** is different. */
		
		MethodOverloading cl = new MethodOverloading();
        cl.getData(2);
        cl.getData("Hello");

	}

}
