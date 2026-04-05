package superVthConstructorsDemo;

public class ChildDemo extends ParentDemo{
	
	public ChildDemo() {
		super(); // this should be always first to call parent constructor
		System.out.println("I'm Child class");
	}

	public static void main(String[] args) {
		ChildDemo cd = new ChildDemo();
		
	}

}
