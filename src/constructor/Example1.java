package constructor;

public class Example1 {

	// initialization --> using constructor ( name of the class)
	
	int number;
	String name;
	
	// Constructor 
	Example1 (int num, String falcon){
		number = num;
		name = falcon;
		
	}
	// main method 
	public static void main(String[]args) {
		// creating an object 
		Example1 obj = new Example1(20,"falcon");
		
		// display
		System.out.println("Number: "+obj.number);
		System.out.println("Name: "+obj.name);
	}
}
