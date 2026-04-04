package coreJavaBrushUp1;

public class literalStringNewString {

	public static void main(String[] args) {
		// String is an obj
		// string literal
		// if same value is there then it will not create new memory space, it points to the same var.
		String s = "Rahul shetty academy";
//		String s1 = "Rahul shetty academy";
		
		// new: this creates new space
		
		String s2 = new String("Hi");
//		String s3 = new String("Hi");
		
		// split a string
		
		String[] splitString = s.split("shetty");
		
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		
		System.out.println("*********************************");
		// remove space
		System.out.println(splitString[1].trim());
		
		// print each char from "s" in reverse order
		
		for(int i=s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
