package coreJavaBrushUp1;

public class MethodDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d = new MethodDemo();
		d.getData();
		d.getVal(); // this will not return anything even we have created return
		String name = d.getVal(); // to print return type, assign it to a var n print
		System.out.println(name);
		
		//To access MethodDemo2 class data need to create an obj
		MethodDemo2 d2 = new MethodDemo2();
		d2.getDataFromAnotherClass();
		
		// access static method
		getData2();
	}
	
	// To create a method without return type, then use void
	public void getData() {
		System.out.println("Hi Maha");
	}
	
	// To return string, add String in place of void while creating method
	public String getVal() {
		System.out.println("How are you?");
		return "Maha";
	}

	// create static method, so we dont need to create obj, then it belongs to class not obj
	public static void getData2() {
		System.out.println("I'm from static method");
	}
}
