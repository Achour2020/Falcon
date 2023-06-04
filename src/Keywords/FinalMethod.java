package Keywords;

public class FinalMethod {

	// final method 
	
		final static void display() {
			System.out.println("My final static method");
		}
		
		final void print() {
			System.out.println("printing without static");
		}
		
		// main method 
		public static void main(String[] args) {
			display();
			
			// create an object 
			FinalMethod fm = new FinalMethod();
			fm.print();
		}
}
