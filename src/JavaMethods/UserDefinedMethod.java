package JavaMethods;

public class UserDefinedMethod {

	// create user defined method
	
		public static void method1() {
			
			// for loop
			for (int i=0; i<5; i++) {
				System.out.print(" " +i);
			}
		}
		
		// same class calling 
		public static void main (String [] args) {
			method1(); 
			
		}
	
}
