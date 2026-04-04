package superKeywordDemo;

public class ChildDemo extends ParentDemo{
	
	// topic: will see how to handle the variable with same name in parent and child class using super keyword
	String name = "Maha, I'm the child";
	public void getStringData() {
		System.out.println(name); // will print the child class variable
		System.out.println(super.name); // will print the parent class variable
	}

	public static void main(String[] args) {
		
		ChildDemo a = new ChildDemo();
		a.getStringData();

	}

}
