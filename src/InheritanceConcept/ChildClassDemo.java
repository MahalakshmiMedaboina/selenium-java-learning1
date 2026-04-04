package InheritanceConcept;

public class ChildClassDemo extends ParentClassDemo{
	
	public void engine() {
		System.out.println("new engine");
	}
	
	public void color() {
		System.out.println(color);
	}

	public static void main(String[] args) {
		ChildClassDemo a = new ChildClassDemo();
		a.color();
		a.audioSystem();
		a.brakes();
		a.engine();

	}

}
