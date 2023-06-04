package inheritance;

public class Dog extends Animal{

	// extends --> inheritance
    
		// Copy of the method in child class -- > Overridden method
		
		@Override
		public void display() {
			name ="Ace Dog" ;
			System.out.println("\nName: "+name);
		}
		
		@Override
		public void displayAge() {
			age = 3; 
			System.out.println("Age: " +age);
		}
}
