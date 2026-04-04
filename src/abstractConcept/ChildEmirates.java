package abstractConcept;

public class ChildEmirates extends ParentAirCraft{

	public static void main(String[] args) {
		
		ChildEmirates c = new ChildEmirates();
		c.engine(); 	// because of inheritance we can able to access methods without creating obj of parent
		c.safetyGuidelines();
		c.colour();
		
//		note: we cannot instantiate abstract class means i cannot create obj like: ParentAirCraft p = new ParentAirCraft
	}

	@Override
	public void colour() {
		
		System.out.println("Red Colour on the body");
		
	}

}
