package oopsJava;

public class InitializeObjectReference {

	// Initializing an object through a reference
	
		// class student
		int id; 
		String name;
		double mark; 
		
		// main method
		public static void main (String [] args) {
			// creating object 
			InitializeObjectReference student = new InitializeObjectReference ();
			
			student.id = 1; 
			student.name = "Ahmad"; 
			student.mark = 94.8; 
			
			System.out.println("Student ID: " + student.id);
			System.out.println("Student Name: " + student.name);
			System.out.println("Student Mark: " + student.mark);
		}
}
