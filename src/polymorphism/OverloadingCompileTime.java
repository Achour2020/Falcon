package polymorphism;

public class OverloadingCompileTime {

	// Overloading method 
	
		public void display() {
			for(int i=0; i<=5; i++) {
				System.out.print(" " + i);
			}
		}
		
		public void display(int i) {
			for(i=5; i>=0; i--) {
				System.out.print(" " +i);
			}
		}
		
		public void display(char c) {
			for(c='A'; c<='Z'; c++) {
				System.out.print(" " +c);
			}
		}
		
		// main method 
		public static void main(String[] args) {
			// creating an object 
			OverloadingCompileTime obj = new OverloadingCompileTime();
			obj.display();
		
			System.out.println("\n");
			
			obj.display(5);
			
			System.out.println("\n");
			
			obj.display(' ');
		}
}
