package thisKeyword;

public class ThisDemo {
	
	int a = 2; //global variable, it has class level scope
	
	public void getData() {
		int a = 3; // local variable, only method level scope
		System.out.println(a); //o/p: 3
		
		// to print global var use this keyword
		System.out.println(this.a);
		
		// sum local & global var
		System.out.println(a+this.a);
	}
	

	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		td.getData();
	}

}
