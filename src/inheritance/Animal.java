package inheritance;

public class Animal {

	/*
	  Class: design/ sketch 
	  Object: is an instance of the class
	  		Instance variable : state 
	  		Instance methods  : behavior 
	  		
	  Inheritance: a relation between two class --> pass the copy of the instances
	  		
	  		*/
	
	String name; 
	int age;
	
	public void display() {
		name = "Animal Name";
		System.out.println("Name: " +name);
	}
	
	public void displayAge() {
		age = 5; 
		System.out.println("Age: " +age);
	}
	// only for the class of Animal
		public void eat() {
			System.out.println("The Animal is eating food");
		}
}
