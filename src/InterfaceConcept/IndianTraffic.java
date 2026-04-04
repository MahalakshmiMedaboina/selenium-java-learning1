package InterfaceConcept;

public class IndianTraffic implements centralTraffic, continentalTraffic{

	public static void main(String[] args) {
		
//		IndianTraffic a = new IndianTraffic(); // this line creates obj to impl methods present in IndianTraffic. but we using centralTraffic's methods so
		centralTraffic a = new IndianTraffic(); // now IndianTraffic class impl all methods present in centralTraffic interface
		
		a.RedStop();
		a.GreenStart();
		a.YellowBeReady();
		
		
		
		// To use IndianTraffic method, we need to create a obj for it.
		IndianTraffic b = new IndianTraffic();
		b.WalkOnSymbol();
		
		// to use continentalTraffic method create method for it
		continentalTraffic c = new IndianTraffic();
		c.TrainSymbol();

	}
	
	
	public void GreenStart() {
		System.out.println("Green light indicates us to start, from centralTraffic interface");
	}
	
		
	public void RedStop() {
		System.out.println("Red light indicates us to stop, from centralTraffic interface");
	}
	
	
	public void YellowBeReady() {
		System.out.println("Be ready to start, from centralTraffic interface");
	}
	
	// create a method for Indian Traffic
	
	public void WalkOnSymbol() {
		System.out.print("People can walk, from IndianTaffic class");
	}
	
	public void TrainSymbol() {
		System.out.print("train symbol, from contientalTraffic interface");
	}
}
