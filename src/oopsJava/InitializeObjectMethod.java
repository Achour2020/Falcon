package oopsJava;

public class InitializeObjectMethod {

	// Initializing an object through method
	
			// class student
			int id; 
			String name;
			double mark; 
			
			// method 
			public void studentMethod(int id, String name, double mark) {
				// this --> point to an argument for reference the object through method
				this.id = id; 
				this.name = name; 
				this.mark = mark; 
			}
			
			// main method
			public static void main (String [] args) {
				// creating an object class
				InitializeObjectMethod student = new InitializeObjectMethod();
				
				student.studentMethod(1, "Ahmad", 87.5);
				System.out.println("Student ID: " + student.id);
				System.out.println("Student Name: " +student.name);
				System.out.println("Student Marks: " +student.mark);
				
			}
}
