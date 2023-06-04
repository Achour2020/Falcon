package constructor;

public class ParameterizedConstructor_4 {

	/*
	  Parameterized Constructor: has one or more parameter inside the function --> ()
	 */
	
	String name; 
	int id; 
	
	// Constructor --> argument type 
	ParameterizedConstructor_4 (String n, int i) {
		// this: a keyword --> point/ refer to instance of the class
		this.name = n; 
		this.id = i; 
    }
	
	 // main method
	public static void main(String[] args) {
		// Creating an object of the class
		ParameterizedConstructor_4 obj = new ParameterizedConstructor_4("Falcon SDET", 233);
		System.out.println("Name: " + obj.name);
		System.out.println("ID: " + obj.id);
	}
		
}
