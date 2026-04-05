package SuperVthMethodDemo;

public class ChildDemo extends ParentDemo{
	
//	Topic: if parent & child has same method name how to handle with Super keyword
	
	public void getData() {
		System.out.println("I'm Child class");
		super.getData(); // o/p: I'm Parent class
		}

	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
		cd.getData(); // o/p: I'm Child class
		

	}

}
