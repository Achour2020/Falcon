package constructor;

public class Animal_5 {

	// instances 
		int legs; 
		String sound; 
		String name; 
		
		// Constructor --> argument constructor
		Animal_5(int legs, String sound, String name) {
			// connect the reference to the parameter  --> this
			
			this.legs = legs; 
			this.sound = sound;
			this.name = name; 
		}
		
		// method 
		void display() {
			System.out.println("Legs: " + legs +"\nSound: " +sound + "\nName: " +name);
			
		}
		
		// main method
		public static void main(String[] args) {
			// Create an object 
			Animal_5 dog = new Animal_5(4, "barking: bow", "Dog Ace"); 
			System.out.println("Display for Dog: ");
			dog.display();
			
			Animal_5 cat = new Animal_5(4, "Meow", "Cat TOM");
			System.out.println("\nDisplay for Cat: ");
			cat.display();
		}
}
