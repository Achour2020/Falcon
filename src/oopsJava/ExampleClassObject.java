package oopsJava;

public class ExampleClassObject {
    // to initialize an object for class through a reference, method, constructor
	// reference
	
	String name_class;
	int number_student; 
	
	// main
	public static void main (String[]args) {
		// creating an object
		ExampleClassObject falcon = new ExampleClassObject(); 
		
		// initialize using reference 
		falcon.name_class = "Falcon SDET Class";
		falcon.number_student = 11;
		
		// print / display 
		System.out.println("Class Name: "+ falcon.name_class);
		System.out.println("Students Number: "+ falcon.number_student);
	}
}
