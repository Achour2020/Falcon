package oopsJava;

public class ClassObject {

	/*
	   Class: sketch, prototype, design 
	   
	   Object: instance(sample) of the class
	   		   State/Properties: variable
	   		   Behavior/Action : method 
	   		   
	   		   Attribute: variable plus literal value --> name = "email"    |     x = 3
	 */
	
	
  // class student 
	int student_id; // 0
	String student_name; 
	double student_marks; 
	
	// main method
	public static void main(String [] args) {
		// create object the class
		ClassObject obj = new ClassObject(); 
		System.out.println("Student ID: " + obj.student_id);
		System.out.println("Student Name: " +obj.student_name);
		System.out.println("Student Marks: " +obj.student_marks);
		
		// initializing the values for different student
		// student1
		ClassObject st1 = new ClassObject();
		st1.student_id = 101; 
		st1.student_name = "Sara"; 
		st1.student_marks = 78.9; 
		
		System.out.println("\nStudent1 ID: " + st1.student_id);
		System.out.println("Student1 Name: " + st1.student_name);
		System.out.println("Student1 Marks: " + st1.student_marks);
		
		// student2
		ClassObject  st2 = new ClassObject();
		st2.student_id = 108; 
		st2.student_name = "Dhruv"; 
		st2.student_marks = 81.4; 
		
		System.out.print("\nStudent2 ID: " +st2.student_id);
		System.out.print("\nStudent2 Name: " +st2.student_name);
		System.out.print("\nStudent2 Marks: " +st2.student_marks);
	}
}
