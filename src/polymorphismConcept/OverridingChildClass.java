package polymorphismConcept;

public class OverridingChildClass extends OverridingParentClass{
	/*overriding rules: 
		Method name is same

		Return type is same
		
		Argument list is same
		
		Parameter types are same
		
		Only implementation changes  */
	
	//will override audio system
	
	public void audioSystem() {
		System.out.println("new audio system code is implemented from child class");
	}

	public static void main(String[] args) {
		OverridingChildClass cd = new OverridingChildClass();
		cd.audioSystem();
		
	}

}
