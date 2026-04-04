package coreJavaBrushUp1;

public class MethodDemo2 {
	
	public void getDataFromAnotherClass() {
		System.out.println("I'm from another class");
	}
	
	// create private method, so that another class cannot access
	private void ImPrivateMethod() {
		System.out.print("I'm private method, I restrict other classes to access me");
	}
	
	public static void main(String[] args) {
		MethodDemo2 d2 = new MethodDemo2();
		d2.ImPrivateMethod();
	}
}
