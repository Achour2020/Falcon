package oopsJava;

public class Animal {

	/* 
	   Class: sketch, prototype, design 
	   
	   Object: instance(sample) of the class
	   		   1. State/Properties: variable
	   		   2. Behavior/Action : method 
	 */
	
	// State/ variable
	String name; 
	String color; 
	int age; 
	String breed; 
	
	// Behavior/Action : method 
	public String getInfo() {
		return ("Name: " +name + "\nColor: "+color + "\nAge: "+age + "\nBreed: "+breed); 
	}
	
	// Action
	public static void sleep() {
		System.out.println("The animal is sleeping");
	}
	
	static void eat() {
		System.out.println("The animal is eating food!");
	}
	
	// main method 
	public static void main(String [] args) {
		// create an object of the class  for different animal
		
		// Dog --> attribute     container = value 
		Animal dog = new Animal();
		dog.name = "Ace"; 
		dog.color = "White";
		dog.age = 4; 
		dog.breed = "Maltese"; 
		
		
		// display
		System.out.println(dog.getInfo());
		sleep();
		eat();
		// Dog --> Husky
		System.out.println();
		Animal husky = new Animal();
		husky.name = "Husky"; 
		husky.color = "Black & White";
		husky.age = 4; 
		husky.breed = "Husky breed";
		
		System.out.println(husky.getInfo());
		sleep();
		
		
		// Cat
		System.out.println();
		Animal cat  = new Animal();
		cat.name = "Persian Cat"; 
		cat.color = "White";
		cat.age = 1; 
		cat.breed = "Persian breed"; 
		
		System.out.println(cat.getInfo());
		// calling method sleep
		 sleep();
		
	}
}
