package methodesPractice;

public class ClassObject {

	/*
	  Class: blue print / design
	  Object: instance of the class
	  		state --> variable 
	  		behavior --> method 
	 */
	
	String name; 
	long population; 
	
	// void 
	public void display() {
		System.out.println("State Name: " +name);
		System.out.println("State Population: " +population);
	}
	
	// main method
	public static void main(String [] args) {
		
		// creating an object of the class
		ClassObject va = new ClassObject();
		va.name = "Virgina";
		va.population = 8000000000l; 
		
		System.out.println("State Name: " +va.name);
		System.out.println("State Population: " +va.population);
		
		
		// Texas
		ClassObject tx= new ClassObject();
		tx.name = "Texas";
		tx.population = 8256000L; 
		
		System.out.println("\nState Name: " +tx.name);
		System.out.println("State Population: " +tx.population);
		
		
		float f = 123.100000000000000f; 
	}
}
