package constructor;

public class OverLoadingConstructor_6 {

	// Constructor can be overloaded
	
		int x; 
		int y; 
		
		// 1. no argument constructor 
		OverLoadingConstructor_6(){
			x = 10; 
			y = 20; 
			System.out.println("Display: No Argument Constructor ");
		}
		// 2. Parameterized constructor 
		OverLoadingConstructor_6(int value1){
			x = value1; 
			y = value1; 
			System.out.println("\nDisplay: Parameterized --> one args ");
		}
		
		// Overloading 
		OverLoadingConstructor_6(int value1, int value2){
			x = value1; 
			y = value2; 
			System.out.println("\nDisplay: Parameterized --> multiple args ");
		}
		// custom method 
		public void display() {
			System.out.println("X: " +x + "\nY: " +y );
		}
		
		// main method 
		public static void main(String[] args) {
			// create an object 
			OverLoadingConstructor_6 obj1 = new OverLoadingConstructor_6();// no argument
			obj1.display();
			
			OverLoadingConstructor_6 obj2 = new OverLoadingConstructor_6(25); // do an argument 
			obj2.display();
			
			OverLoadingConstructor_6 obj3 = new OverLoadingConstructor_6(100, 200); // do an argument --> overloaded args 
			obj3.display();
		}

}
