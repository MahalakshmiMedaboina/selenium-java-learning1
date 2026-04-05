package thisKeyword;

public class StaticVar {
	
	// Topics: instance variable, local variable, class variables, static block, static method
	
	String name, address; // instance variables
	static String city; // class variables: All static vars are class variables
	static int i; // to see if same memory shared all each increment or not
	
	static{   //static block
		city ="Banglore";
		i = 0;
	}
	
	public StaticVar(String name, String address) { //local variable
		this.name=name; // local variable assigning to instance var
		this.address=address;
		i++;
		System.out.println(i);
	}
	 
	public void getAddress() { //method
		System.out.println(address);
	}
	
	public static void getCity() { // static method
		System.out.println(city);
		
	}

	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Maha","Marthalli"); 
		obj.getAddress(); //non-static method accessed with obj instance
		
		StaticVar obj1 = new StaticVar("Rahul","Jayanagar");
		obj1.getAddress();
		
		StaticVar.getCity(); //static method accessed with class name

	}

}
