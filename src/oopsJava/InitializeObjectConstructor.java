package oopsJava;

public class InitializeObjectConstructor {

	// Initialization of object through constructor
	
		/*
		   Class: Design
		   Object: instance of the class
		          State: variable 
		          Behavior: method
		          
		          Attribute: container = literal_value
		          
		    Constructor: Build with Name of the the class --> Constructor
		 */
		
		int student_id; 
		String student_name; 
		double student_marks; 
		
		InitializeObjectConstructor (int id, String name, double marks){
			
			// initialization 
			student_id = id;    //    Attribute: container = literal_value
			student_name = name; 
			student_marks = marks; 
			
		}
		
		// main method 
		public static void main (String [] args) {
			// creating an object
			InitializeObjectConstructor st1 = new InitializeObjectConstructor(5, "Ahmad", 99.1);
			System.out.println("Name: " + st1.student_name);
			System.out.println("ID: " +st1.student_id);
			System.out.println("Marks: " +st1.student_marks);
			
			InitializeObjectConstructor st2 = new InitializeObjectConstructor(4, "John", 98.1);
			System.out.println("\nName: " + st2.student_name);
			System.out.println("ID: " +st2.student_id);
			System.out.println("Marks: " +st2.student_marks);
			
			
			InitializeObjectConstructor st3 = new InitializeObjectConstructor(3, "Sara", 100);
			System.out.println("\nName: " + st3.student_name);
			System.out.println("ID: " +st3.student_id);
			System.out.println("Marks: " +st3.student_marks);
			
		}
}
