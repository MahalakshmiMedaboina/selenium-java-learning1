package coreJava;

public class ConstructorDemo {
	
	// constructor will not return any value
	// constructor name is same as class name
	public ConstructorDemo() {  // if we dont create any constructor compiler will call default[implict] constructor
		System.out.println("Iam a default constructor"); 
	}
	
	public ConstructorDemo(int a, int b) {
		System.out.println("Iam a parameterized constructor");
	}
	
	public void getData() {
		System.out.println("Iam a method");
	}
	
	public ConstructorDemo(String str) {
		System.out.println("Iam a parameterized constructor with string parameter");
	}

	
	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo(); // when this line executed, control will check is any constructor explicitly defined
		// if it is defined it will execute that particular block, when no parameter is passed it will execute default constructor, when parameter is passed it will execute parameterized constructor
		// whenever an obj is created constructor is called auto
			
		ConstructorDemo pc = new ConstructorDemo(10,20); // we can execute multiple objects with different constructors
		
		ConstructorDemo sp = new ConstructorDemo("Hello"); // this will give compile time error if we dont have any constructor with string parameter
		cd.getData();
		
		// 
	}

}
